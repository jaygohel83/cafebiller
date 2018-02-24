package cafe.biller.discount;

import java.util.Map;

import cafe.biller.bill.Order;
import cafe.biller.menu.MenuItems;

/**
 * @author Jay Gohel
 *Discounts can be on individual items. For example: buy 2 or more coffee (Latte) and get 25% off
 */
public class OfferOnLatte implements DiscountRules{

	@Override
	public double Apply(Order order) {
		double discount = 0;
		for(Map.Entry<String,Integer> entry : order.getOrderItems().entrySet())
		{
			String code = entry.getKey();
			int qnty = entry.getValue();
			
			if("CL".equals(code) && qnty >=2)
			{
				discount = order.getTotal()*0.25; 
			}
		}
		return discount;
	}

}

package cafe.biller.discount;

import cafe.biller.bill.Order;

/**
 * @author Jay Gohel
 * If total bill > 100, then put flat 10% discount on total amount,
	If total bill > 200 then 10% discount on 200 INR and 20% discount on the amount exceeding 200.
 */
public class DiscountOnTotal implements DiscountRules{
	
	@Override
	public double Apply(Order order) {
		double discount = 0;
		int total = order.getTotal();
		if(total >= 200)
		{
			int exceedAmount = total - 200;
			total = 200;
			discount = (total * 0.10) + (exceedAmount * 0.20);
		}
		else if(total >= 100)
		{
			discount = total * 0.10;
		}
		return discount;
	}

}

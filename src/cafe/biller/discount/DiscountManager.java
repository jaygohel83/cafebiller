package cafe.biller.discount;

import java.util.ArrayList;
import java.util.List;

import cafe.biller.bill.Order;

/**
 * @author Jay Gohel
 * Manager class for calculating discount. this will take care of ordering of discount rules and assign discount to orders.
 *
 */
public class DiscountManager {
	
	List<DiscountRules> ruleList = new ArrayList<DiscountRules>();
	public static DiscountManager instance = new DiscountManager();
	
	/**
	 * create list of discount rules
	 */
	private DiscountManager()
	{
		DiscountRules onTotal = new DiscountOnTotal();
		DiscountRules latteOffer = new OfferOnLatte();
		ruleList.add(latteOffer);
		ruleList.add(onTotal);
		
	}
	
	/**
	 * @return DiscountManager
	 * making this class singleton to avoid recreation of instance.
	 */
	public static DiscountManager getInstance()
	{
		if(instance != null)
			instance = new DiscountManager();
		return instance;
	}
	
	/**
	 * @param order
	 * @return discount
	 * this will set discount in order class based on rules.
	 */
	public double calculateDiscount(Order order)
	{
		Double discountAmount = 0.0;
		for(DiscountRules rules:ruleList)
		{
			discountAmount = rules.Apply(order);
			if(discountAmount > 0)
			{
				break;
			}
		}		
		order.setDiscount(discountAmount);
		return discountAmount;
	}

}

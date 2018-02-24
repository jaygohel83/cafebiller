package cafe.biller.discount;

import cafe.biller.bill.Order;

/**
 * @author Jay Gohel
 * interface for discount rules. any new rules must implement this interface to apply the discount in order.
 */
interface DiscountRules {
	
	public double Apply(Order order);

}

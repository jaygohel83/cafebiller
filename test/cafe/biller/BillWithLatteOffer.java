package cafe.biller;

import cafe.biller.bill.Order;
import junit.framework.TestCase;

public class BillWithLatteOffer extends TestCase{
	public BillWithLatteOffer(String testName)
	{
		super(testName);
		GenerateMenu.generateMenu();
		
	}
	
	public void testLatteOfferLessThan100BillAmount()
	{
		
		Order order = new Order(4);
		order.add("TM", 2);
		order.add("CL", 2);
		order.generateBill();
	}
	
	public void testLatteOfferMoreThan100BillAmount()
	{
		Order order = new Order(5);
		order.add("CL", 3);
		order.add("TM", 3);
		order.add("CDC", 2);
		order.generateBill();
		
	}
}

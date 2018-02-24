package cafe.biller;

import cafe.biller.bill.Order;
import junit.framework.TestCase;

public class DiscountOfferTest extends TestCase{
	public DiscountOfferTest(String testName)
	{
		super(testName);
		GenerateMenu.generateMenu();		
	}
	
	
	public void testBillLessThan100()
	{
		Order order = new Order(1);
		order.add("TM", 2);
		order.add("CC", 2);
		order.generateBill();
	}
	public void testBillBetween100to200()
	{
		Order order = new Order(2);
		order.add("CL", 1);
		order.add("TI", 3);
		order.add("CDP", 2);
		order.generateBill();
	}
	public void testBillMoreThan200()
	{
		Order order = new Order(3);
		order.add("TM", 2);
		order.add("CC", 2);
		order.add("TI", 2);
		order.add("CM", 3);
		order.add("CDC", 1);
		order.add("CC", 1);
		order.generateBill();
	}
}

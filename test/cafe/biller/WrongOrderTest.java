package cafe.biller;

import cafe.biller.bill.Order;
import junit.framework.TestCase;


public class WrongOrderTest extends TestCase  {
	
	public WrongOrderTest(String testName)
	{
		super(testName);
		
	}

	public void testWrongOrder()
	{
		try{
		Order order = new Order(1);
		order.add("PL", 1);
		order.add("TM", 3);
		order.add("CDC", 2);
		order.generateBill();
		}catch(Exception e)
		{
			assertEquals("Item is not available in store!!, please order from menu items.", e.getLocalizedMessage());
		}
		
	}

}

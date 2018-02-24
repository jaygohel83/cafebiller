package cafe.biller.bill;

import java.util.Iterator;

import cafe.biller.discount.DiscountManager;
import cafe.biller.menu.MenuItems;

/**
 * @author Jay Gohel
 * this class is responsible for generating and printing the bill
 */
public class Bill {
	
	/**
	 * @param order - total items in orders
	 * this method generate the bill after calculating discounts 
	 */
	public void generateBill(Order order)
	{
		DiscountManager.getInstance().calculateDiscount(order);
		printBill(order);
	}

	/**
	 * @param order
	 * printing the bull
	 */
	private void printBill(Order order) {
		StringBuilder builder = new StringBuilder("Order # : "  + order.getNumber() + "\n");
		builder.append("Item Name \t \t Qty \t Price (INR) \n");
		Iterator<String> orderItr = order.getOrderItems().keySet().iterator();
		while(orderItr.hasNext())
		{
			String code = orderItr.next();
			int qnty = order.getOrderItems().get(code);
			int price = MenuItems.getPrice(code) * qnty;
			builder.append(MenuItems.getFullName(code) + " \t \t" +  qnty + " \t " + price + "\n");			
		}
		builder.append("Total \t  \t \t " + order.getTotal() + "\n");
		builder.append("Discount \t \t \t " + order.getDiscount() + "\n");
		builder.append("Final Amount \t \t \t " + order.getFinalAmount() + "\n");
		builder.append("Enjoy your drink... Visit Again ... Thank You");
		System.out.println(builder.toString());
		
		
	}
	
	

}

package cafe.biller.bill;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import cafe.biller.menu.MenuItems;

/**
 * @author Jay Gohel
 * class contains information about orders
 */
public class Order {
	
	private int number;
	private Map<String,Integer> orderItems; 
	private int total = 0;
	double discount = 0;
	double finalAmount = 0;
	Bill bill;
	
	public Order(int number)
	{
		this.number = number;
		orderItems = new LinkedHashMap<String,Integer>();
		bill = new Bill();
	}

	/**
	 * @param code
	 * @param qnty
	 * adding items in cart
	 */
	public void add(String code, int qnty)
	{
		if(!MenuItems.isItemAvailable(code))
		{
			throw new RuntimeException("Item is not available in store!!, please order from menu items.");
		}
		if(orderItems.containsKey(code))
		{
			int qty = orderItems.get(code);
			orderItems.put(code,(qty+qnty));
		}
		else
		{
			orderItems.put(code, qnty);
		}
		total = total + (MenuItems.getPrice(code) * qnty);		
	}
	
	/**
	 * generate the bill
	 */
	public void generateBill()
	{
		bill.generateBill(this);
	}

	public int getNumber()
	{
		return number;
	}
	
	public Map<String, Integer> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Map<String, Integer> orderItems) {
		this.orderItems = orderItems;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
		this.finalAmount = total - this.discount;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

}

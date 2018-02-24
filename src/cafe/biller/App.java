package cafe.biller;

import cafe.biller.bill.Order;
import cafe.biller.item.Item;
import cafe.biller.menu.MenuItems;

/**
 * @author Jay Gohel
 *
 */
public class App {

	/**
	 * This is a main method to test application 
	 * same can be testing through test cases as well
	 */
	public static void main(String[] args) {
		//Adding items to menu
		Item tm = new Item("Tea","Masala","TM",10);
		Item ti = new Item("Tea","Ice","TI",15);
		Item tl = new Item("Tea","Lemon","TL",15);
		
		Item cc = new Item("Coffee","Cold","CC",15);
		Item cl = new Item("Coffee","Latte","CL",30);
		Item cm = new Item("Coffee","Mocha","CM",40);
		
		Item cdk = new Item("Cold Drink","Coke","CDC",20);
		Item cdp = new Item("Cold Drink","Pepsi","CDP",20);
		Item cds = new Item("Cold Drink","Sprite","CDS",15);
		//showing the menu items on console
		MenuItems.show();
		
		//Testing the bills
		Order order = new Order(1);
		order.add("CL", 1);
		order.add("TM", 3);
		order.add("CDC", 2);
		order.generateBill();
		
		
		order = new Order(2);
		order.add("CL", 1);
		order.add("TI", 3);
		order.add("CDP", 2);
		order.generateBill();
		
		
		order = new Order(3);
		order.add("TM", 2);
		order.add("CC", 2);
		order.add("TI", 2);
		order.add("CM", 3);
		order.add("CDC", 1);
		order.add("CC", 1);
		order.add("CL", 4);
		order.generateBill();
		
		order = new Order(4);
		order.add("TM", 2);
		order.add("CC", 2);
		order.generateBill();
		
		order = new Order(4);
		order.add("TM", 2);
		order.add("CL", 2);
		order.generateBill();
		
		order = new Order(5);
		order.add("CL", 3);
		order.add("TM", 3);
		order.add("CDC", 2);
		order.generateBill();
	}

}

package cafe.biller;

import cafe.biller.item.Item;

public class GenerateMenu {
	
	public static void generateMenu()
	{
		Item tm = new Item("Tea","Masala","TM",10);
		Item ti = new Item("Tea","Ice","TI",15);
		Item tl = new Item("Tea","Lemon","TL",15);
		
		Item cc = new Item("Coffee","Cold","CC",15);
		Item cl = new Item("Coffee","Latte","CL",30);
		Item cm = new Item("Coffee","Mocha","CM",40);
		
		Item cdk = new Item("Cold Drink","Coke","CDC",20);
		Item cdp = new Item("Cold Drink","Pepsi","CDP",20);
		Item cds = new Item("Cold Drink","Sprite","CDS",15);
		
	}

}

package cafe.biller.item;

import cafe.biller.menu.MenuItems;

/**
 * @author Jay Gohel
 *	item class cotains all necessary information about items
 */
public class Item {
	
	private String category;
	private String name;
	private String code;
	private int price;

	public Item(String category, String itemName, String itemCode, int price)
	{
		this.category = category;
		this.name = itemName;
		this.price = price;
		this.code = itemCode;
		MenuItems.add(this);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return category + " - " + name + "("+code+"):" + price ;
	}
	
	
	
	
}

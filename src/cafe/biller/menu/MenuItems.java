package cafe.biller.menu;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import cafe.biller.item.Item;

/**
 * @author Jay Gohel
 * This class is like master class for billing which contains menu information. 
 * price and code in the application is used from here.
 */
public class MenuItems {
	
	static Map<String,Item>  menuItems = new TreeMap<String,Item>();
	
	public static void add(Item item)
	{
		menuItems.put(item.getCode(), item);
	}
	
	public static int getPrice(String code)
	{
		return menuItems.get(code).getPrice();
	}
	
	public static String getFullName(String code)
	{
		return menuItems.get(code).getCategory() + "-" + menuItems.get(code).getName();
	}
	
	public static boolean isItemAvailable(String code)
	{
		if(!menuItems.containsKey(code))
			return false;
		return true;
	}
	public static void show()
	{
		Iterator<String> itemIterator = menuItems.keySet().iterator();
		while(itemIterator.hasNext())
		{
			String code = itemIterator.next();
			Item item = menuItems.get(code);
			System.out.println(item);
		}
	}

}

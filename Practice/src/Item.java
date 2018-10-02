import java.util.ArrayList;
import java.util.Collection;

import javax.swing.SpringLayout.Constraints;
public class Item {
	private int id;
	private String name;
	private int price;
	private int phone;
	public Item(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
	/*public void findByPrice(ArrayList<Item> test, int price) {
		for (Item iter: test) {
			if (price==price) {
			System.out.println("der");//Test("id "+id+"name"+name+"price:"+price));
		}
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public static void findByPrice(ArrayList<Item> list , int price){
		System.out.println("i am in findmy price method");
		for (Item loop_itr : list) {
			if(price == loop_itr.getPrice()) {
				System.out.println(loop_itr);
		
		}
		
		
	}
	}
	public static void findByName(ArrayList<Item> list , String name) {
		String str = new String();
		System.out.println("obj created");
		for (Item item : list) {
			if (str.equals(item.getName()))
				System.out.println(item);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name is: "+this.name + " price is " + this.price;
	}
	
	public static void compare(ArrayList<Item> list ,String name) {
		
		
	}
	
	public static void compare(ArrayList<Item> list ,int price) {
		
	}
}

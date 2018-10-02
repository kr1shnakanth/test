
import java.util.ArrayList;
import java.util.Collections;


public class PracticeItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> test = new ArrayList<Item>();
		test.add(new Item(1,"Merc",120));
		test.add(new Item(2,"Audi",150));
		test.add(new Item(3,"Ford",180)); 
		Item.findByPrice(test, 180);
		Item.findByName(test, "A ");  
		

	}
	
	

}

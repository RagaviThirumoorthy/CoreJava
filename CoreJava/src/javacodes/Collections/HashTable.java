package javacodes.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		//Add values
		table.put(0, "Anna");
		table.put(1, "Bonnie");
		table.put(2, "Caroline");
		table.put(3, "Damon");
		table.put(4, "Elena");
		table.put(5, "Fredrick");
		table.put(6, "Grace");
		
		System.out.println(table);
		
		//Replace value
		table.replace(5, "Flora");
		//Delete value
		table.remove(6);
		//prints random value
		System.out.println(table.get(2));
		System.out.println(table.get(6));
		
		//Converts map to set having a set view of the mappings contained in this map
		Set sm = table.entrySet();
		Iterator it = sm.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());		//set view
		
		}
		
	}

}

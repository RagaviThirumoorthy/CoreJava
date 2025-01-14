package javacodes.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//Add values
		map.put(0, "Anna");
		map.put(1, "Bonnie");
		map.put(2, "Caroline");
		map.put(3, "Damon");
		map.put(4, "Elena");
		map.put(5, "Fredrick");
		map.put(6, "Grace");
		
		System.out.println(map);
		
		//Replace value
		map.replace(5, "Flora");
		//Delete value
		map.remove(6);
		//prints random value
		System.out.println(map.get(2));
		System.out.println(map.get(6));
		
		//Converts map to set having a set view of the mappings contained in this map
		Set sm = map.entrySet();
		Iterator it = sm.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());		//set view
			//To get key and value separately
			Map.Entry<Integer, String>  mapEntry = 	(Map.Entry<Integer, String>)it.next();
			System.out.println(mapEntry.getKey());
			System.out.println(mapEntry.getValue());
		}
		
	}

}

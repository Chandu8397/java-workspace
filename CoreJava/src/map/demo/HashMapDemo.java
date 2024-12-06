package map.demo;

import java.util.HashMap;
import java.util.Map;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :10:16:39 am
*Email  :Mekapothula.Reddy@coforge.com
*
*data in the form of Key-Value Pairs
*/

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(111, "Chandu");
		hm.put(222, "Jim");
		hm.put(333, "Mike");
		hm.put(444, null);
		hm.put(null, "Jimmy"); 
		hm.put(null, "Jack");
		
		for(@SuppressWarnings("rawtypes") Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}	}

}

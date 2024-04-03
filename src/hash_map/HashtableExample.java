package hash_map;

import java.util.*;

public class HashtableExample {

	public static void main(String[] args) {
		Enumeration nms;
		String key;
		Hashtable<String,String>Hashtable=new Hashtable<String,String>();
		Hashtable.put("keys1", "Adam");
		Hashtable.put("keys2", "Brain");
		Hashtable.put("keys3", "Charles");
		Hashtable.put("keys4", "Dean");
		Hashtable.put("keys5", "Peter");
		nms=Hashtable.keys();
		while(nms.hasMoreElements()) {
			key=(String)nms.nextElement();
			System.out.println("key is "+key+" & value is "+Hashtable.get(key));
		}
		
		

	}

}

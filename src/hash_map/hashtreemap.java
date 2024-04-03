package hash_map;

import java.util.Map;
import java.util.TreeMap;

public class hashtreemap {

	public static void main(String[] args) {
		TreeMap<Integer,String>TM=new TreeMap<Integer,String>();
		TM.put(100, "Gosling");
		TM.put(101, "da vinci");
		TM.put(102, "Ankit");
		TM.put(103, "Ankpam");
		TM.put(104, "Rudra");
		TM.put(104, "Rudrs");
		System.out.printf("our set contains %d",TM.size());
		System.out.println();
		System.out.println("lowest key is "+TM.firstKey());
		System.out.println("highest key is "+TM.lastKey());
		for(Map.Entry m:TM.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Initial set :"+TM);
		System.out.println("Reverse set:"+TM.descendingMap());
		System.out.println("subset: "+TM.subMap( 101,true,104,true));

	}

}

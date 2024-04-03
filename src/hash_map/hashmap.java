package hash_map;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		System.out.println("initial list of element"+hm);
		hm.put(100,"Ankit");
		hm.put(101,"Anupam"); 
		hm.put(102,"Sankhap");
		hm.put(null,"Arvind");
		System.out.println("After invoke put method");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("initial list of element: "+hm);
		hm.remove(101);
		System.out.println("update list of system: "+hm);
		hm.remove(102,"rahul");
		System.out.println("update list of element: "+hm);
		
		

	}

}

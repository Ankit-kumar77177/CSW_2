package hash_map;
import java.util.*;
public class hashtable {

	public static void main(String[] args) {
		Hashtable<String,String>Hashtable=new Hashtable<String,String>();
		Hashtable.put("100", "Amit");
		Hashtable.put("101", "Ravi");
		Hashtable.put("102", "vijay");
		Hashtable.put("103", "Ankit");
		Hashtable.put("104", "Anupam");
		for(Map.Entry m:Hashtable.entrySet()) {
		System.out.println("before remove: "+Hashtable);
		Hashtable.remove(102);
		System.out.println("after remove : " +Hashtable);
		System.out.println(Hashtable.getOrDefault(101, "not found"));
		System.out.println(Hashtable.getOrDefault(105, "not found"));
//		Hashtable.putIfAbsent(105, "gaurav");
		
		
		
		}
		 

	}

}

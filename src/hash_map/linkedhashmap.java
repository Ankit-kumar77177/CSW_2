package hash_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>lhm=new LinkedHashMap<Integer,String>();
		lhm.put(3,"hello..");
		lhm.put(2,"hi..");
		lhm.put(1,"hew are you");
		for(Map.Entry<Integer,String>mapElement:lhm.entrySet()) {
			Integer key=mapElement.getKey();
			String value=mapElement.getValue();
			System.out.println(key+": "+value);
			}
	}

}

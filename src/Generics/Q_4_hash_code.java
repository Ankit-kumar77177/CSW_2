package Generics;

public class Q_4_hash_code {
//Q_1
	public static void main(String[] args) {
		String a="hello";
		String b="world";
		System.out.println("the hashcode of a= "+a+":"+a.hashCode());
		System.out.println("the hashcode of b= "+b+":"+b.hashCode());
		String c="hello";
		System.out.println("the hashcode of c= "+c+":"+c.hashCode());
		Integer a_hashcode=a.hashCode();
		Integer c_hashcode=c.hashCode();
    	System.out.println("Hash code of a==c:"+(a_hashcode).equals(c_hashcode));
		//System.out.println(a.hashCode()).equals(c.hashCode());
		//Q_2
    	int value = 144;
		int hashvalue = Integer.hashCode(value);
		System.out.println("Hashcode of value of " + value + " is " + hashvalue);

		
	}

}

package Generics;

public class Q_5_hash_override {
	public int myvar;

	Q_5_hash_override(int myvar) {
		this.myvar = myvar;
	}

	public int hashcode() {
		return (myvar * 23);
	}

	public boolean equals(Object o) {
		if (o instanceof Q_5_hash_override) {
			Q_5_hash_override htest = (Q_5_hash_override) o;
			if (htest.myvar == this.myvar) {
				return true;

			} else
				return false;

		}
		return false;
	}

	public static void main(String[] args) {
		int a = 144, b = 157, c = 144;
		Q_5_hash_override obj1 = new Q_5_hash_override(a);
		Q_5_hash_override obj2 = new Q_5_hash_override(b);
		Q_5_hash_override obj3 = new Q_5_hash_override(c);
		System.out.println("Hashcode of value of 144 is " + obj1.hashcode());
		System.out.println("Hashcode of value of 157 is " + obj2.hashcode());
		System.out.println("Hashcode of value of 144 is " + obj3.hashcode());
		Integer obj1_hashvalue = obj1.hashcode();
		Integer obj2_hashvalue = obj2.hashcode();
		Integer obj3_hashvalue = obj3.hashcode();
		System.out.println("equality comparision b/w " + a + " and " + b + " hash value: "
				+ obj1_hashvalue.equals(obj2_hashvalue));
		System.out.println("equality comparision b/w " + a + " and " + b + " hash value: "
				+ obj2_hashvalue.equals(obj3_hashvalue));
		System.out.println("equality comparision b/w " + a + " and " + b + " hash value: "
				+ obj1_hashvalue.equals(obj3_hashvalue));

	}

}

package Assignment_3;

class pair<K, V> {
	private String key;
	private String value;

	pair(String key, String value) {
		this.key = key;
		this.value = value;

	}

	public void setkey(String key) {
		this.key = key;
	}

	public void getkey() {
		System.out.println("the key is " + this.key);
	}

	public void setvalue(String value) {
		this.value = value;
	}
	public void getvalue() {
		// TODO Auto-generated method stub
		System.out.println("the value is " + this.value);

	}
}

public class Q_1 {

	public static void main(String[] args) {
		pair<String, String> p1 = new pair<>("CSE 123", "ANKIT KUMAR");
		pair<String, String> p2 = new pair<>("CSE 124", "ANUPAM KUMAR");
		pair<String, String> p3 = new pair<>("CSE 125", "KISHAN JHA");
		pair<String, String> p4 = new pair<>("CSE 126", "RAM KUMAR");
		p1.getkey();
		p1.getvalue();
		p2.getkey();
		p2.getvalue();
		p3.getkey();
		p3.getvalue();
		p4.getkey();
		p4.getvalue();

	}

}

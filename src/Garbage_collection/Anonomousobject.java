package Garbage_collection;

public class Anonomousobject {
	private String myobject;
	public Anonomousobject(String myobject) {
		this.myobject=myobject;
	}
	
	public static void main(String[] args) {
		new Anonomousobject("testobject1");
		System.gc();

	}
	protected void finalize() throws Throwable {
		System.out.println(this.myobject);

}
}
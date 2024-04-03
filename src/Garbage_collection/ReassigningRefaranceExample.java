package Garbage_collection;

public class ReassigningRefaranceExample {
	private String myobject;

	public ReassigningRefaranceExample(String myobject) {
		this.myobject = myobject;

	}

	public static void main(String[] args) {
		ReassigningRefaranceExample testobj1 = new ReassigningRefaranceExample("testobject1");
		ReassigningRefaranceExample testobj2 = new ReassigningRefaranceExample("testobject2");
		testobj1 = testobj2;
		System.gc();

	}

	protected void finalize() throws Throwable {
		System.out.println(this.myobject);
		//System.out.println("vfctuyv");
	}

}

package Garbage_collection;

public class UnrechableObjectExample {
	private String myobject;

	public static void main(String[] args) {
		testMethod1();
		System.gc();
		UnrechableObjectExample obj= new UnrechableObjectExample ("xyz");
	}

	public UnrechableObjectExample(String myobject) {
		this.myobject = myobject;

	}

	private static void testMethod1() {
		UnrechableObjectExample myobjecttest1 = new UnrechableObjectExample("myobjecttest1");
		testMethod2();
	}

	private static void testMethod2() {
		UnrechableObjectExample myobjecttest1 = new UnrechableObjectExample("myobjecttest2");

	}

	protected void finalize() throws Throwable {
		System.out.println(this.myobject);

	}

}

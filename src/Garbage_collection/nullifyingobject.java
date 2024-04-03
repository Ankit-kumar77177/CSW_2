package Garbage_collection;

public class nullifyingobject {
	private String myobject;

	public nullifyingobject (String myobject) {
		this.myobject = myobject;

	}

	public static void main(String[] args) {
		nullifyingobject testobj1 = new  nullifyingobject("testobject1");
		nullifyingobject testobj2 = new  nullifyingobject("testobject2");
		testobj1 = null;
		
		System.gc();

	}

	protected void finalize() throws Throwable {
		System.out.println(this.myobject);
		//System.out.println("vfctuyv");
	}

	 
	}



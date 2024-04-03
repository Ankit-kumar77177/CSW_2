package Generics;
class Test<T,U> {
	T obj1;
	U obj2;
	Test(T obj1,U obj2) {
		this.obj1 = obj1;
		this.obj2= obj2;
	}
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

public class Q_2 {

	public static void main(String[] args) {
		 
		Test <Integer> iobj1 = new Test<Integer>(15);
		System.out.println(iobj1.getObject());
		Test<String> sobj1 = new Test<String>("hello java");
		System.out.println(sobj1.getObject());

	}

}

 

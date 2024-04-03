package Generics;

public class EqualsDemo {
static int a=10,b=20;
int c;
EqualsDemo(){
	System.out.println("Addition of 10 and 20");
	c=a+b;
	System.out.println("Answer:  "+c);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st object created...");
		EqualsDemo obj1=new EqualsDemo();
		System.out.println("2nd object created...");
		EqualsDemo obj2=new EqualsDemo();
	}

}

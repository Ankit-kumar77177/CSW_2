package Error_handling;

class helloWorld{
String name=" ";
public void assignName(String Name) {
	this.name =name;
}
}
public class myClass {
	public static void main(String[] args) {
		helloWorld object=new helloWorld() ;
		object.assignName("hello World");
			System.out.println(object.name);
		

	}

}

package Assignment_2;
class student <T>{
	T rollno;
	String name;
	double age;
	public student(int i) {
		// TODO Auto-generated constructor stub
	}
	public void student(T rollno) {
		this.rollno=rollno;
	}
	public void setrollno(T rollno) {
		this.rollno=rollno;
	}
	public T getrollno() {
		return rollno;
	}
	public void student(double age) {
		this.age=age;	
	}
	public void setage(double age) {
		this.age=age;
	}
	public double getage() {
		return age;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		 return name;
	}
}
public class Q_1 {
	
	 

	public static void main(String[] args, String Ankit ) {
	student<Integer> obj1 =new student(1234);
	obj1.setrollno(23);
	obj1.setage(20);
	obj1.setname(Ankit);
	obj1.getrollno();
	obj1.getage();
	obj1.getname();
	 
	}

}

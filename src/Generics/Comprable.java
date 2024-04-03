package Generics;
import java.util.*;
public class student implements Comprable<student>{
	String name ;
	int age;
	
	student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public int getage() {
		return age;
		
	}
	public String getname() {
		return name;
	}
	
}

public class Comprable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj1=new student("Ankit" 23) {
			System.out.println("the first obj name:"+obj1.name.toString()+"and age"+obj1.age);
			
		}

	}

}

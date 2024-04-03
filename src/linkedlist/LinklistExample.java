package linkedlist;

import java.util.LinkedList;

public class LinklistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj=new LinkedList<String> ();
		obj.add("b");
		obj.add("c");
		obj.add( "c");
		System.out.println("LinkedList is: "+obj);
		obj.addFirst( "a");
		obj.addLast( "f");
		System.out.println("Linked list is: "+obj);
		obj.add( 4,"e");
		obj.add( 3,"d");
		System.out.println("LinkedList is : "+obj);
		obj.remove("b");
		obj.remove(3);
		obj.removeFirst();
		obj.removeLast();
		System.out.println("LinkedList After removing: "+obj);
		boolean start=obj.contains( "e");
		if(start) {
			System.out.println("list contain element 'e'");
		}
		else {
			System.out.println(" list is empty");
		}
		int size=obj.size();
		System.out.println("size of linlist is: "+size);
		}

}



//7OTW2N9
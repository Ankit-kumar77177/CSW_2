package Queue;

import java.util.PriorityQueue;
import java.util.*;
public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>prqueue=new PriorityQueue<String>();
		prqueue.add("c");
		prqueue.add("java");
		prqueue.add("python");
		prqueue.add("c++");
		System.out.println("the element in priority queue: "+prqueue);
		System.out.println("the head value using peek function is : "+prqueue.peek());
		System.out.println("the total queue element are: ");
		Iterator itr1=prqueue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());	
		}
		prqueue.poll();
		System.out.println("After removing eith poll fn: ");
		Iterator itr2=prqueue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr1.next());	
		}
		
	}

}

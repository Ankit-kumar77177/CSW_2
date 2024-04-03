package vector;
import java.util.Vector;
import java.util.Enumeration;
public class VectorExample {

	public static void main(String[] args) {
		Vector vec=new Vector(3,2);
		System.out.println(" Inital size: "+vec.size());
		System.out.println(" initial capacity "+vec.size());
		vec.addElement(new Integer(1));
		vec.addElement(new Integer(2));
		vec.addElement(new Integer(3));
		System.out.println("the vector is: "+vec);
		System.out.println("now capacity is: "+vec.capacity());
		vec.addElement(new Integer(4));
		System.out.println("The vector "+vec);
		System.out.println("now capacity is: "+vec.capacity());
		
		vec.addElement(new Double(6.55));
		System.out.println("The vector "+vec);
		System.out.println("now capacity is: "+vec.capacity());
		
		vec.addElement(new Float(9.23));
		vec.addElement (new Integer(8));
		System.out.println("The vector "+vec);
		System.out.println("now capacity is: "+vec.capacity());
		System.out.println("First element is :"+(Integer)vec.firstElement());
		System.out.println("Last element is "+(Integer)vec.lastElement());
		if(vec.contains(new Integer(3))) {
			System.out.println("Vector contain element 3");
		}
		Enumeration vecEnum=vec.elements();
		System.out.println("element in the vector: ");
		while(vecEnum.hasMoreElements()) {
			System.out.print(vecEnum.nextElement());
		}
		

	}

}

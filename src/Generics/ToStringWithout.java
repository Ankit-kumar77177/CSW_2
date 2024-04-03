package Generics;

public class ToStringWithout {

	
		int x,y;
		public ToStringWithout(int anX,int aY) {
			x=anX;
			y=aY;}
		public String toString() {
			return "ToStringWith[" +x+" best of luck "+y+"]" ;
		}
		
		public static void main(String[] args) {
			ToStringWithout	S= new ToStringWithout(42,86);
			System.out.println(S);

	}

}

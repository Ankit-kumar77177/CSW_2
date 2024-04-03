class Area{
	int computeArea(int a,int b) {
		int x=a,y=b;
		int area=x*y;
		return area;
		
		
	}
	Double computeArea(int a) {
		int r=a;
		double area=(3.15*r*r);
		return area;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area aa=new Area();
		Double area =aa.computeArea(5);
		System.out.println("circle Area"+area);
		int Area= aa.computeArea(25, 20);
		System.out.println("rectangular area= "+ Area);
		
	}

}

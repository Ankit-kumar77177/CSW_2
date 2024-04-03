package Assignment_1;

import java.util.*;

class rectangle {
	private double length;
	private double width;

	public rectangle(double a, double b) {
		this.length = a;
		this.width = b;

	}

	public double getwidth() {
		return width;
	}

	public void setwidth(double width) {
		this.width = width;
	}

	public double getlength() {
		return length;

	}

	public void setlength(double length) {
		this.length = length;
	}

	public double getarea() {
		return length * width;

	}

	public double getperameter() {
		return 2 * (length * width);

	}
}

public class Q_2 {

	public static void main(String[] args) {
		rectangle rec = new rectangle(6.0, 9.0);
		System.out.println("Area " + rec.getarea());
		System.out.println("paremeter " + rec.getperameter());
		rec.setwidth(5);
		rec.setwidth(7);
		rec.getarea();
		rec.getperameter();
	}

}

package Assignment_1;

interface vehicle {
	public void accelerate();

	public void brake();
}

class cars implements vehicle {

	public void brake() {
		System.out.println("vcar stop after 20km travel");
	}

	@Override
	public void accelerate() {

		System.out.println("car run at 20km/hr");
	}
}

class bicycle implements vehicle {
	public void accelerate() {
		System.out.println(" bicycle  running at 10km/hr");
	}

	public void brake() {
		System.out.println("bicycle stops running after 10km/hr");
	}

}

public class Q_8 {

	public static void main(String[] args) {
		cars c1 = new cars();
		cars c2 = new cars();
		c1.accelerate();
		c2.brake();
		bicycle b1 = new bicycle();
		b1.accelerate();
		b1.brake();

	}

}
package Error_handling;

public class test_Throw {
	public static void validiate(int age) {
		if(age <18) {
		throw new ArithmeticException("persion is eligible to vote") ;
	}
	else {
		System.out.println("persion is eligible to vote");
	}
}
	public static void main(String[] args) {
		validiate(20);
		validiate(15);
		System.out.println("rest of code");
		

	}

	}

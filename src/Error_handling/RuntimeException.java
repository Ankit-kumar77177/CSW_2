package Error_handling;

public class RuntimeException {

	public static void main(String[] args) {
		int var1=5;
		int var2=10;
		try {
		
		int var3=var2/var1;
		System.out.println(var3);
		}
		catch(Exception e) {
			System.out.println("this division is tends to infinity so, it is not possible ");
		}
		

	}

}

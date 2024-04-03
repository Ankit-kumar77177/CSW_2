package Error_handling;

public class try_catch {

	public static void main(String[] args) {
		try {
			int[] mynum = { 1, 2, 3 };
			System.out.println(mynum[2]);
		} catch (Exception e) {
			System.out.println("some things went worng");

		} finally {
			System.out.println("the try catch is finnished");
		}

	}
}
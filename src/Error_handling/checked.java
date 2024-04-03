package Error_handling;
import java.io.*;
public class checked {
	public static void main(String[] args) {
		FileReader file=new FileReader("\"C:\\Users\\hp\\Desktop\\example.txt\" ");
		BufferedReader fileinput =new BufferedReader(file);
		for(int counter =0;counter<3; counter++) {
			System.out.println(fileinput.readLine());
			fileinput.close();
		}
	}

}

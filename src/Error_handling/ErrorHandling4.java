package Error_handling;
import java.io.*;
//import java.util.*;
 
public class ErrorHandling4 {

	public static void main(String[] args) {
		 FileReader file =null;
 try {
		 file=new FileReader("\"C:\\Users\\hp\\Desktop\\example.txt\"");
		 }
 catch(FileNotFoundException e1){
	 e1.printStackTrace();
	 System.out.println("the file path is null or point to non existing file");
	
 }
         BufferedReader fileinput=new BufferedReader(file);
         for(int counter=0;counter<3;counter++)
        	 System.out.println(fileinput.readLine ());
        	 fileinput.close();
         File fileobj=new File("\"C:\\Users\\hp\\Desktop\\Test1.txt\"");
         PrintWriter printwriter =new  printWriter(new  printWriter(Fileobj));
         printwriter.println("hello feature world");
         printwriter.close();
	}

}

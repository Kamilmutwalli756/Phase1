package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
	
	public static void main(String[] args) {
		
	
	String data="100,India,Maharashtra,Mumbai";
	try{
		
		
		FileWriter a = new FileWriter("data1.txt");
		
		a.write(data);
		System.out.println("Data is written sucessfully");
		a.close();
	
	}catch(IOException ex) {
		System.out.println("File Write Error...");	
	}
	
}
}
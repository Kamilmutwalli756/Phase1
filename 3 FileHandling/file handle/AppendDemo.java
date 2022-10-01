package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {
	public static void main(String[] args) {
		
		String data ="This data is appended..";
		try {
			FileWriter  output = new FileWriter("data1.txt,true");
			output.write(data);
			System.out.println("Data appended Successfully");
			output.close();	
		} catch(IOException ex) {
			System.out.println("file append error");
		}
	}

}

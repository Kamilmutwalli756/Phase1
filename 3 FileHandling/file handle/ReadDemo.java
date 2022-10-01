package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDemo {

	public static void main(String[] args) {
		char[] data =new char[100];
		try {
			FileReader input =new FileReader("data1.txt");
			input.read(data);
			System.out.println("data recived from file");
			System.out.println(data);
			input.close();
			
		}catch(IOException ex) {
			System.out.println("file read error..");
		}
	}
}

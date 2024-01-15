package task11_Day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;

public class Qeight {


	public static void main(String[] args) {
//the filenotfound exception occurs to cath the exception using try -catch -block 			 

try {
	File file = new File("C:\\Users\\moorth0n\\OneDrive - BOBST\\Desktop\\mohana\server.txt");   // create a file and file path

	FileReader fc = new FileReader(file);  //read the file if file is present or not
} catch (FileNotFoundException e) {
	System.out.println("The file not Exists");   //in catch block give print statement and printstacktrace for reference
	e.printStackTrace();
}
	}

}

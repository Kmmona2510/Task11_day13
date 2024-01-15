package task11_Day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Qsix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);  //using Scanner class to get the password from the user
		
		System.out.println("Enter Password");
		String pass = sc.next();             // get the password
		try{
		if (pass.length() < 5) {                   //using try catch to handle the password mismatch 
			System.out.println("Enter valid password");
			
					}
		}catch(Exception in) {
			System.out.println("The enterted the password is not correct");
		}
			System.out.println("The password is good");
	}

}

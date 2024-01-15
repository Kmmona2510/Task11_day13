 package task11_Day13;

import java.util.Scanner;

public class Qseven {

	public static void main(String[] args) throws InvalideAgeException {  //using customized exception for using throws keyword
     
		Scanner sc = new Scanner(System.in);   //using scanner class for get input to the customer
		
		System.out.println("Enter the Age");
		int age = sc.nextInt();               //get the input
		
		if(age<18) {                    //condition for exception
			throw new InvalideAgeException ("Invalid Age");   //using customized exception 
		}
		
		 System.out.println("Valid Age");

		
	}
	

}

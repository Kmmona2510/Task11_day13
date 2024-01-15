package task11_Day13;

import java.util.Scanner;


public class QFour{
	
	
	
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);   //Getting Input to the user using Scanner class
	
		System.out.println("Enter the First number for Division");   //Get first number
		int Num1= sc.nextInt();
		
		System.out.println("Enter the Second number for Division");  // Get second Number
		int Num2=sc.nextInt();
		
		int divresult=0; 
		
		try {  // using try catch block for unchecked conditio to handle the exception
			
			divresult = Num1/Num2;
		}  catch(ArithmeticException ae) {  // know its Arithemetic Exception so catch block used
			System.out.println("Enter Second Number Value not Zero");
			
		}
		
		System.out.println("The Division result is:" +divresult);
		
		
	}

}

package week2day2democlass;

import java.util.Scanner;

public class basicarithmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the value of i...:");
		int i = scan.nextInt();
		System.out.println("Please Enter the value of j...:");
		int j = scan.nextInt();
		
		//addition
		int add=i+j;
		System.out.println("Addition..:"+add);
		
		//subtraction
		int sub=i-j;
		System.out.println("Subtraction..:"+sub);
		
		//Multiplication
		int mul=i*j;
		System.out.println("Multiplication...:"+mul);
		
		int div=i/j;
		System.out.println("Division...:"+div);//this will have quotient
		
		int mod=i%j;//mod will have the reminder after division
		System.out.println("Reminder...:"+mod);			

	}

}

package week2day2democlass;

import java.util.Scanner;

public class conditondemo {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number..:");
		
		int x = scan.nextInt();
		
		if (x%2==0)
		{
			System.out.println("If-else-if....It is an Even Number");
		}
		else
		{
			System.out.println("If-else-if....It is an odd Number");
		}
		
	// The same thing can be achieved using Ternary operator
		System.out.println((x%2==0)? "Ternary Even Number...": "Ternary odd number...");
		
	// using switch case:
		
		switch(x%2)
		{
		case 0:
		{
			System.out.println("switch case.... Even Number");
			break;
		}
		case 1:
		{
			System.out.println("switch case....Odd number");
			break;
		}
		}
		
	}
}


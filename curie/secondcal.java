package curie;

import java.util.Scanner;

public class secondcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of i:");
        int i = scan.nextInt();
        System.out.println("Enter the value of j:");
        int j = scan.nextInt();
        
        int sum =i + j;
        System.out.println("The Sum of i and j is:"+sum);
	}

}

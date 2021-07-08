package week2day2democlass;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		int z=200;
		System.out.println(x==z);
		System.out.println(x>z);
		System.out.println(x<z);
		System.out.println(x>=100);
		System.out.println(z<=200);
		
		System.out.println(x!=z);
		
		System.out.println("------------------");
		//logical operators
		
		// && -- both conditions to be satisfied
		// || -- one of the condition to be satisfied
		
		System.out.println(x <= 100 && z>200 );
		System.out.println(x <= 100 || z>200);
	}

}

package week2day2democlass;

public class arithmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//++ === increment operator
		//-- === decrement operator
		
		int i=10;
		System.out.println(i++); //post-increment - first value is printed and then incremented
		System.out.println(i); //this prints the incremented value
		
		int j=100;
		System.out.println(++j);//pre-increment
		System.out.println(j);
		System.out.println("___________________________________");
		
		int ii=10;
		System.out.println(ii--);//post decrement-first the value is printed and then decremented
		System.out.println(ii);//this prints the incremented value
		
		int jj=100;
		System.out.println(--jj);//pre decrement - first the value is decremented then printed..
		System.out.println(jj);
	}

}

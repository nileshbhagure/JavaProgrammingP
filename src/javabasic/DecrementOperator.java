package javabasic;

public class DecrementOperator
{

	public static void main(String[] args) {
// Decrement
		int a=100;
		
	//Scenario 1: both case 99 
		//a--;
		//--a;
		//System.out.println(a);  //99
		
//Scenario 2: Post Decrement
		int res=a--;
		System.out.println(res);  //100
		System.out.println(a);   //99
		
		
 // Scenario 3: Pre decrement
		int resu=--a;
		System.out.println(resu); //99
		System.out.println(a);  //99
		
	}

}

package javabasic;

public class AssignmentOperator {

	public static void main(String[] args) {
   //5) Assignment   =   +=   -=   *= /=  %=
   //shorthand operators +=   -=   *= /=  %=
		
	// Increment more value +=
		
	int a=10;
	//a=a+5 Straight forward expression
	//a+=5;   //using increment operator
	System.out.println(a); //15
		
	//decrement more value	
	// a=a-5;
	a-=5;
	System.out.println(a);  //5
	
	
	//Used of *= /=  %=
	int x=5;
	// x=x*2;  //normal expersion
	//x*=2;    //using operator x can be written onces
	
	//x=x/2;    //division will return quiotent 2
	x/=2;       //2
	
	
	x=x%2; //will return reminder
	x%=2; //1
	System.out.println(x);  //10;  //2
	
	}

}

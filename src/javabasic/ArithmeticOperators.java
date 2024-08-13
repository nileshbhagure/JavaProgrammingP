package javabasic;

public class ArithmeticOperators {

	public static void main(String[] args) 
	{

		//1) Arithmetic operators   + - * / %   Work only on no
		int a=20, b=10;
		System.out.println("The sum of a and b is: "+(a+b));  // 30 First bracket part is executed
		System.out.println("The Difference of a and b is: "+(a-b)); //10 
		System.out.println("The Mutipl of a and b is: "+(a*b)); //200
		System.out.println("The Division of a and b is: "+(a/b)); //gives quotients 10/20= 2
		System.out.println("The Modulo of a and b is: "+(a%b));  //gives remainder  10%20= 0
	
		//2) Relational/comparison operators  >  >=  <  <=  !=  ==  
		//work on Numbers, strings, 
		//Always return boolean value true/false
		 
		System.out.println("-------Relational/comparison operators------");
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		
		b=20;
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true

		System.out.println(a!=b); //false
		System.out.println(a==b); //true   //comparison == operator

       //3) Logical operators   &&   ||  !
      // work on atleast two or more boolean values
      //return true or false
	
	   boolean x=true;
       boolean y=false;
       System.out.println("------logical operator---------");
       System.out.println(x && y); //false- both value should be true
	   System.out.println(x || y); //True- either x or y should be true
	   System.out.println(!x); //false
	   
	   boolean b1=10>20; //false
	   boolean b2=20>10; //True
	   System.out.println(b1 && b2); //false
	   System.out.println(b1 || b2); //True
	   

	}

}

package javabasic;

public class TernaryOperator {
/*1. Unary- works under only single variable
 *          ++, --  +=   -=   *= /=  %= !

* 2. Binary- atleast two variable
*            + - * / % >  >=  <  <=  !=  ==  &&   || =
* 3. Ternary- atleast three variable required
*      ?:
*
*/
	
	
	public static void main(String[] args) {
//		6) conditional/ternary operator  ?: 
// to check the condition
// mostly used along with relational operator

		//  var=exp ? result1 : result2
		//Example 1
		int a=200, b=100;
		int x=a>b ? a: b;    //If a is greater b then a value is stored in X else b value is stored in x
		System.out.println(x); //200
		
		//Example 2
		a=1000;
		b=2000;
	    x=b<a ? b: a;  //b is not less then a so result a will be stored in x
	    System.out.println(x);  //1000
		
	  //Example 3
		x=(1==1)? 100: 200;
		System.out.println(x); //100
		
		//Example 4
		int age=20;
		String result=(age>=18) ? "Elgible for Vote" : "Not Eligble for the vote";
	    System.out.println(result); //Elgible for Vote
	}

}

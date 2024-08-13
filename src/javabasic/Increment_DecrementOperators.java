package javabasic;

public class Increment_DecrementOperators 
{

	public static void main(String[] args) 
	{

   //4) Increment & Decrement operators  ++  --
	// ++ increment operator --> pre, post
		
		int a=10;
		
		//Scenario 1- there is no difference between pre/post increment
		//a++;    //a=a+1; //post increment
		//++a; //pre-increment
		//System.out.println(a); //11
		
		//Scenario -2
		//int res=a++; //10 a value is stored in res & then post increment is done
		             //after assignement increment is done
		int res=++a; //11 intially a value is increase
		System.out.println(res);  //10 11
	}

}

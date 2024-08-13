package exception.handling;

import java.util.Scanner;

/*
---------
Exception handling
-----------------
Errors
------
1) Syntax-semicolon, curlyparses, capital/small,
2) Logical- prgm will execute but will give wrong answer

Exception occurs when the user provided invalid input to the program.
Exception is an event which will cause program termination.

1) Checked exceptions
	The exceptions which are identified by java compiler.	
	java complier wil identified which stmt going to throw exception but we need to identify
	Ex: Interupted exception
        FileNotFound
		IOException

2) Un-checked exceptions
	The exceptions which are not identified by java compiler.
    we need to identify the stmt which going to throw exception & handle the same
Ex:
		ArithmeticExeption
		NullPointerException
		ArrayIndexOutOfBoundsException etc...
			etc...

 */
public class UncheckedException {

	public static void main(String[] args) 
	{
      System.out.println("Program started..");
	  System.out.println("Program is in progress..");
	
	//Example 1
	  /*
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a no ");  //Enter 0- gives ArithmeticException- rest stmt will not execute
	  int num=sc.nextInt();	
	  System.out.println(100/num);
	  
	  System.out.println("Program completed..");
	  System.out.println("Program is in exist..");  */

		
	//Example 2
	  /*
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[5]; //0..4
	  
	  System.out.println("Enter the no");
	  int num=sc.nextInt();	
	  
	  System.out.println("Enter the position(0-4)");  // Enter 5 will gives ArrayIndexOutOfBoundsException
	  int pos=sc.nextInt();

	  a[pos]=num;
	  System.out.println(a[pos]);
	  
	  System.out.println("Program completed..");
	  System.out.println("Program is in exist..");
	  */
	  
	  //Example 3
	  String s="nilesh";
	  int i=Integer.parseInt(s);
	  System.out.println(i);     //As we are converting String to int which in input contains only String will give NumberFormatException 
	  System.out.println("Program completed..");
	  System.out.println("Program is in exist..");
	
	}

}

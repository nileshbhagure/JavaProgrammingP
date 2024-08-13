package exception.handling;
import java.util.Scanner;
public class MultipleCatchBlock {
/*
  One try block can have mutiple catch block 
 
 */
	public static void main(String[] args) 
	{
		System.out.println("Program started..");
		System.out.println("Program is in progress..");
		
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no ");  
		int num=sc.nextInt();	
		  
		String s=null;
		/*  
		  try    
		  {
		     //System.out.println(100/num);
			  System.out.println(s.length());  // Null- empty not known 

		  }
		  catch(ArithmeticException e)
		  {	
			  System.out.println("Arithmetic Exception thrown");  // Enter 0
		  }
		  catch(NumberFormatException e)
		  {
			  System.out.println("Number format Exception thrown");
		  }
		  catch(NullPointerException e)
		  {
			  System.out.println("Null pointer Exception thrown");
		  }
		  */
		  
		  try    
		  {
			 // System.out.println(100/num);
			 System.out.println(s.length());  // Null- empty not known 
		  }
		  
		  //Exception is pre-defined class in java/lang pkg
		  //Exception is parent classs of all the except which can handle all types of except
		  catch(Exception e)
		  {	
			  System.out.println("Exception thrown");  // Enter 0
		  }	  
		  
		  System.out.println("Program completed..");
		  System.out.println("Program is in exist..");  

	}

}

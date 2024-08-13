package exception.handling;

import java.util.Scanner;

/*
 finally- not mandatory to write
   - stmt which we need to execute after catch block
   - finally block should be always written after catch block. sequence to be mantain
   -finally should be last block
   -we cannot write muliple try or finally block. only mutiple catch block supported
  
   -try block throw exception-->catch block handles-->finally block will execute
   try block throw exception-->catch block does not handles-->still finally block will execute
   try block not throw exception-->catch block will ignore-->still finally block will execute
  try
  {
  ----
  }
  catch(Exception e)
  {
  ----
  }
  finally
  {
  ----stmt which we need to execute after catch block
  }
  
case1: Exception occured, catch block handled ---> finally block will execute
case2: Exception occured, catch block NOT handled --> finally block will execute
case3: Exception does not occured, catch block ignored ----> finally block will execute

 */
public class TryCatchFinally {

	public static void main(String[] args) 
	{
		System.out.println("Program started..");
		System.out.println("Program is in progress..");	  
		
		//String s=null;  //case1	
		//String s=null; //case 2 add arithemtic exception
		String s="welcome";  //case3	

		try    
		  {
			  System.out.println(s.length());  // Null- empty not known 
		  }
		  catch(Exception e)
		  {	
			  System.out.println("Exception thrown");  // Enter 0
		  }	  
		 
		finally
		{
			System.out.println("Entered into finally block");
		}
		  System.out.println("Program completed..");
		  System.out.println("Program is in exist..");  

	}
	}



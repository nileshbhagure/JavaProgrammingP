package exception.handling;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) 
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a no ");  //Enter 0- gives ArithmeticException- rest stmt will not execute
		  int num=sc.nextInt();	
		  
		  try    // any stmt going to generate exception to keep in try block
		  {
		  System.out.println(100/num);
		  }
		  catch(ArithmeticException e)
		  {
			//e.printStackTrace();   // print the exception name
			  System.out.println(e.getMessage()); //Exception msg
		
			  System.out.println("You have enter invalid input");
		  }
		  System.out.println("Program completed..");
		  System.out.println("Program is in exist..");  

	}

}

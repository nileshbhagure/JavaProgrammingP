package exception.handling;
/*checked level we can handle method level as well as using try/catch
 * checked except are method level we need to throws
 * 
 */
public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program started..");
		System.out.println("Program is in progress..");	  
		/*
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}*/
		
		Thread.sleep(5000);	
		System.out.println("Program completed..");
		System.out.println("Program is in exist..");  
	}

}

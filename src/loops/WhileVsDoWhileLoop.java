package loops;

public class WhileVsDoWhileLoop {

	public static void main(String[] args)
	{
	
		//While loop
  /*
		int i=10;   
		while(i<=5)         
		{
			System.out.println(i); //O/p will not executed as condition is not valid
			i++;
		} */
		
		//Do while loop
		int i=10;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);       //O/p 10 will be executed as stmt will executed atleast onces
		
		

	}

}

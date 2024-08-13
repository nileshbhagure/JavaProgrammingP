package loops;
/*
 for(initilization; condition; inc/dec )
{
statements;
} 
 
 */
public class ForLoop {

	public static void main(String[] args)
	{
       //Eg 1Print 1..10
	/*	
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}  */
		
		//Eg 2 Print even no between 1..10
		/*
		for(int i=2; i<=10; i+=2)
		{
				System.out.println(i);
			
		} */
		 
		//Using if condition
	/*
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}  */
	
		//Eg 3 Print odd  no between 1..10

          /*
		for(int i=1; i<=10; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}       */ 
		
		//Eg 4 print 10..1
		for(int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
		
	}

}

package loops;

public class ForLoopDemo 
{

	public static void main(String[] args)
	{
		//
		//1) Looping statements we can used conditional statements


   /*
	for(int i=1;i<=10;i++);
    {
	if(i!=2 && i!=5 && i!=10)
      {
    	 System.out.println(i);
      }
	}*/
		//2) Conditional statements we can used looping statements
	
		// in looping stmt we can also use conditional stmt
		boolean flag=true;
		if(flag)
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(i);
			}
		}
		else
		{
			for(int i=10; i>=1; i--)
			{
				System.out.println(i);
			}
		}
	}
	

}

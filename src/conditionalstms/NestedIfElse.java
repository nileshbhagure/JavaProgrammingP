package conditionalstms;

public class NestedIfElse 
{
//a if condition having another if condition
	public static void main(String[] args) 
	{

		if(true)
		{
			if(false)
			{
				System.out.println("abc");
			}
			else
			{
				System.out.println("123");
			}			
		}
		
		else if(true)
		{
			if(false)
			System.out.println("xyz");
		}
		
	}

}

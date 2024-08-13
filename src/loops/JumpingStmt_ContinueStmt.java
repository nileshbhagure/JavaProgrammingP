package loops;

public class JumpingStmt_ContinueStmt {

	public static void main(String[] args)
	{
		
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				continue; //continue the condition based on certain condition 
			}             // 5 will not print it will conitinue will next condition
			System.out.println(i);  // 1 2 3 4 6 7 8 9 10
		}
		}
	}


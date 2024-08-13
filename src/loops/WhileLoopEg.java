package loops;
/*
 while(condition)
{
statements;
inc/dec;
}
 */
public class WhileLoopEg 
{

	public static void main(String[] args) 
	{
		
		//Eg 1: Print 1 to 10
         /*  int i=1;  //Initialization
           while(i<=10)  //condition
           {
        	   System.out.println(i); 
        	   i++;  //increment/dec
           }*/
	
		//Eg 2: Print OM SAI RAM 10 times
	      /*int i=1;
	      while(i<=10)
	      {
	    	  System.out.println("OM SAI RAM");
	    	  i++;
	      }*/
		
		//Eg 3: Print Even no between 1 t0 10 
		  // approch-1
		/*int i=2;         //even no start with 2
	
		while(i<=10)
		{
			System.out.println(i);  //2
		     i=i+2;
		}*/
		
		// approch-2
	/*	int i=1;
		while(i<=10)
		{
			 if(i%2==0)
			 {
				 System.out.println(i);
			 }
			 i++;
		}*/
		
		//Eg 4: Print Odd no between 1 t0 10 
	    //Approch 1
		/*int i=1;
	  while(i<=10)
	  {
		  System.out.println(i);
		  i=i+2;
	  }*/
	  
	  //Approch 2: using if condition
	/*		int i=1;
		while(i<=10)
		{
			 if(i%2!=0)
			 {
				 System.out.println(i);
			 }
			 i++;
		}*/
		
		//Eg Print 10...1
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
	  
	}

}

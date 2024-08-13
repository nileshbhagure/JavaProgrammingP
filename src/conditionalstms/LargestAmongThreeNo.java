package conditionalstms;
/* a,b,c
  a>b and a>c  a is largest
  b>a and b>c  b is largest
  c>a and c>b  c is largest
  
 
 */
public class LargestAmongThreeNo {

	public static void main(String[] args)
	{
       int a=300, b=200, c=500;
       
       if(a>b && a>c)    // && operator return true if both condition is true
       {
    	  System.out.println("a is largest " + a);
       }
       
       else if(b>a && b>c)
       {
    	   System.out.println("b is largest " + b);
    	   
       }
       
       else
       {
    	   System.out.println("c is largest " +c);
       }
	}

}

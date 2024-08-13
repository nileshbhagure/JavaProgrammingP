package conditionalstms;
/* Limitation of switch case
 1)will not support strings, Boolean, Character, Long...
2) additionally we use 'break' in every case
 */
public class SwitchCaseEg
{

	public static void main(String[] args) 
	{
       int weekno=8;
       
       switch(weekno)
       {
       case 1: 
    	   System.out.println("Sunday");
    	   break;
       case 2: 
    	   System.out.println("Monday");
    	   break;   
       case 3: 
    	   System.out.println("Tuesday");
    	   break;
       case 4: 
    	   System.out.println("Wednesday");
    	   break;
       case 5: 
    	   System.out.println("Thur");
    	   break;
       case 6: 
    	   System.out.println("Friday");
    	   break;
       case 7: 
    	   System.out.println("Saturday");
    	   break;	   
    	default:
    		System.out.println("Invalid weekno");
    	
	   }

     }
}

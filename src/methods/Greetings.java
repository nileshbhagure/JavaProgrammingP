package methods;
/*
 Method - block or group of statements which will perform certain task.
 we have to call the method though object.
1) No Params   No return value
2) No Params   Return value
3) Take params  No Return
4) Take params  Return a value

Method:
-----------------
1) Method name can be anything
2) Method may or may not return a value
3) If method is not returnign any value then specify void
4) Method can take parameters/arguments
5) We have to invoke/call methods explicitely through object
6) used for specifying logic
 */

public class Greetings 
{

   //1) No Params No return value
	
	void greetings1()
	{
		System.out.println("Method 1-No Params No return value");
	}
	
	//2) No Params return value
	
        String greetings2()
        {
          return "Method 2-No Params return value"; 	
        }

   //3 Takes Params No return value
         
        void greetings3(String name)
        {
        	System.out.println("Method 3-Takes Params.."+"  "+name);  //concat local variable
        }

        //4) Take params  Return a value

        String greetings4(String name)
        {
        	return ("MEthod 4-Takes Param "+name);
        }
}




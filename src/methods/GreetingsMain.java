package methods;

public class GreetingsMain
{

	public static void main(String[] args) 
	{

		Greetings gr=new Greetings();
		gr.greetings1(); //method 1

		String str=gr.greetings2(); //method 2
	    System.out.println(str);
	 // System.out.println(gr.greetings2());  //println will print str 
	 
	    gr.greetings3("No return value");  ////method 3
	    
	    String val=gr.greetings4("Return a value"); //method 4
	    System.out.println(val);
	}

}

package statickeyword;

public class StaticMain
{

	public static void main(String[] args)
	{
//  If main method is in different class in order to access static variable.method with the help of classname we need to call 

	   System.out.println(Staticdemo.a);  //calling by classname
	   Staticdemo.m1();                  //calling by classname

	   Staticdemo obj=new Staticdemo();
	   System.out.println(obj.b);
	   obj.m2();
	 
	   obj.m();
	   
	}

}

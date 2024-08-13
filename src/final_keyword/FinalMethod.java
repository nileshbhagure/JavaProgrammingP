package final_keyword;

//methods - we cannot override methods in the child class

class Test1
{
	final void m1()
	{
		System.out.println("This is Test1 method");
	}
}

class Test2 extends Test1
{
 //	void m1()                   ///we cannot overide the m1() method as it declared as final
	{
		System.out.println("This is Test2 method");
	}
}


public class FinalMethod {

	public static void main(String[] args) 
	{

	}

}

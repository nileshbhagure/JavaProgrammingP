package final_keyword;
/*
final
1.Variables - we cannot change the value of variable ( constant)
2.methods - we cannot override methods in the child class
3.classes - we cannot extend the class in to another class
 */

class Test
{
	final int a=100;   //constant value we cannot change
}


public class FinalVariable
{

	public static void main(String[] args)
	{
	 Test t=new Test();
    // t.a=200;   //we cannot change the value of variable a as its declared as final
     System.out.println(t.a);
     }

}

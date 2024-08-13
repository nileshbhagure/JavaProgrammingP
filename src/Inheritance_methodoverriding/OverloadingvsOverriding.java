package Inheritance_methodoverriding;
/*overriding

Method Overriding: Method with same name same argument. can be done in inheritance. Method defn is same only implementation is different. Applicable for variable & methods
---------
1) Possible only in  Multiple classes/inheritance.
2) We should NOT change the definition of the method but body we should change.
3) method names are same
4) Related to inheritence

Method Overloading
-------------------
1) Possible in Single & Multiple classes/inheritance
2) We should change the definition
 of the method
3) method names are same.
4) Related to polymorphism 
 */


class abc
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class xyz extends abc
{
	void m1(int a)   // overriding method
	{
		System.out.println(a*a);
	}
	
	void m1(int a, int b)  //overloading method
	{
		System.out.println(a+b);
	}
}



public class OverloadingvsOverriding {

	public static void main(String[] args) 
	  {
		xyz x1=new xyz();
		x1.m1(10);  //100
		x1.m2(20);  //20
		x1.m1(30);  //900
		x1.m1(20, 30); //50
	}

}

package interface_demo;


//only one class we can extends but we can implements multiple interface
// extends keyword should be first in defn
public class Base extends MultipleInterface implements Interface1, Interface2
{

	public static void main(String[] args) 
	{
      Base b1=new Base();
      b1.m1();
      b1.m2();
      b1.m3();
	}

}

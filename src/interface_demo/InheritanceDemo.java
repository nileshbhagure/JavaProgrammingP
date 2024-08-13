package interface_demo;
/*

Abstract class & interface we can achieved Data Abstraction
 if we used abstract class we cannot achieved 100% data abstraction but using interface we can achieved 100% Data Abstra
Interface- provide both data hidding and  Data Abstration(invisible)	

-------------
Abstraction is a process of hiding the implementation details 
and showing only functionality to the user.
- privacy & security

Interface
-------------
An interface is a blue print of class.
Interface contains final & Static variables by default. we cannot create normal variable
Interface contains abstract methods.( also allowed default methods & Static methods from java8 onwards)
An abstract method is a method contains definition but not body(Un-implemented method).
 void m();   // abstract method
Methods in interface are by default public.
Interface supports the functionality of multiple inheritance.
We can define interface with interface keyword.
A class extends another class, an interface extends another interface but a class implements an interface.
We can create Object reference for Interface but we cannot instantiate interface(object creation).
 
-We used the interface onces we know the req(what) but does not know the design(how) 
 - will create interface & in interface will create abstract method & later onces design is know by using class wil implement interface
class C1
{
Variables
final static int x=10;

methods
void m()    //default access modifier
	{
	//code
	}
}

interface I1
{
Variables
methods
m();
}

void m()   //methods are public by default
{
//code
}

void m();   // abstract method

visiblity prefrence
public
default- by default in class methods are defaults
protected
private
 
 */

interface Shape
{
	int Length=10;    //by default variable are final and static
	int width=20;
	
	void circle();   //abstract method- only defn no implementation
	
	default void square()   //interface allow implementation of default & static method
	{ 
		System.out.println("This is square-default method");
	}

     static void rectangle()  //interface allow implementation of static method
     {
    	 System.out.println("This is rectangle- static method");
     }


}


//child class must implement the interface in another class & all abstract method must be implemented
public class InheritanceDemo implements Shape
{
   public void circle()     //whenever we are implementation the abstract method in child class should be mention public
   {
	   System.out.println();
   }
	
	
	public static void main(String[] args) 
	{
        //interface we cannot create object
		// by using child class(implemented interface method) we can access all method
		InheritanceDemo Id=new InheritanceDemo();
		Id.circle();   //child class method we can access
		Id.square();   // interface default method we can access
	    
		//static method can access directly
		Shape.rectangle(); // static method we can class using interface name.method name. 
	    
	//	Shape s=new Shape();  //incorrect-We cannot create object of the Interface(instantiate interface)
	
	  //interface variable can hold object of child class		
		Shape sh=new InheritanceDemo();  //we can create object reference by using interface reference variable=new classname(that implentation the interfance)
	  //we can access ever method using interface variable
		sh.circle();
		sh.square();
		Shape.rectangle();  //static method can be class using interfacename.methodname
	    
	}

}

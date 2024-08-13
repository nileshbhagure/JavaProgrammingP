package Inheritance_methodoverriding;
/*Inheritence
----------------
Aquiring all the properties(Variables) & behaviour(methods) from one class to another class is called inheritance.

class  A--- varaibles & methods
class B --- variables & methods
class B extends A
{
}

A  - Parent / Super/ Base
B - Child /Sub /Derived

objectives
-----
1) re-usability
2) avoid duplication

types
----------
1) Single- One parent-> one child
2) Multi level: A->B->C A Parent->B child again C is dervived from B
3) Hierarchy: Mutiple child class with single parent class
4) Multiple: Not Supported by java. Using Interface we can achieved. Mutiple parent class to single child class
             through class not supported. we cannot write class c extends B A which extends 2 class at a time
            - when there are 2 method with same name(arg) in parent class so in child class which to call creates ambiguity problem
              java gives by default methods
Object --- root class of all the classes we create
  */

//1. Single Inheritance
 class A
{
	int a=100;
	
	void display()
	{
	System.out.println(a);	
	}
}


 class B extends A
{
	int b=200;
	
	void show()
	{
	System.out.println(b);	
	}
}

public class SingleInheritance 
{

	public static void main(String[] args) 
	{
        B obj=new B();
       // obj.a=100;  //we can assign
        //obj.b=200;
        
        System.out.println(obj.a);  //100
        System.out.println(obj.b);  //200
        obj.display(); //100
        obj.display();	//200	
	}

}

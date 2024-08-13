package Inheritance_methodoverriding;

//1. Mutilevel Inheritance:A->B->C A Parent->B child again C is dervived from B
//   C can get all the properties of B & A
class C
{
	int a=100;
	
	void display()
	{
	System.out.println(a);	
	}
}


class D extends C
{
	int b=200;
	
	void show()
	{
	System.out.println(b);	
	}
}

class E extends D
{
	int c=300;
	
	void print()
	{
	System.out.println(c);	
	}
}

public class Mutilevel_Inheritance 
{

	public static void main(String[] args) 
	{
      E obj=new E();
     // obj.a=100;  //we can assign
      //obj.b=200;
      
      System.out.println(obj.a);  //100
      System.out.println(obj.b);  //200
      System.out.println(obj.c);  //300
      obj.display(); //100
      obj.show();	//200	
	  obj.print();  //300
	}

}

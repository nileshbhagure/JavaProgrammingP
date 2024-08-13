package Inheritance_methodoverriding;

//1. Hierarchy Inheritance:One parent to mutiple child class
// Inter child does share properities with each other. Only parent properities are share with child

class Parent
{

void display(int a)
{
System.out.println(a);	
}
}


class Child1 extends Parent
{

void show(int b)
{
System.out.println(b);	
}
}

class Child2 extends Parent
{

void print(int c)
{
System.out.println(c);	
}
}

public class Hierarchy_Inheritance 
{

public static void main(String[] args) 
{
 //Child1 can access method of child1 & parent class only
 Child1 c1=new Child1();
 c1.display(100);
 c1.show(200);
 
 Child2 c2=new Child2();
 c2.display(300);
 c2.print(400);
 
}

}



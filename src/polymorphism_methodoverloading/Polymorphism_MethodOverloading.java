package polymorphism_methodoverloading;
/*
one thing can have many forms...
Method with same name with different parameter

Shape - circle,  square, triangle, rectangle
water -  vapour, ice burg

polymorphism can achive using overloading concept..

Req:  As a user , add numbers ( 2, 3, 4 ....)
 As a user remaing this remembering one method is easy
add(10,20);
add(10,20,30);
add(10,20,30,40);
-------
addtwo(10,20)
addthree(10,20,30)
addfour(10,20,30,40)

4 rules are applicable in overloading
1) Method names should be same
2) number of parameters should be different
3) Data type of parameters should be different
4) Order of parameters should be different */

public class Polymorphism_MethodOverloading 
{
    int x,y,z;
    double d;
    
    void sum()                   //1
    {
    	x=10;
    	y=20;
    	System.out.println(x+y);
    }
    
    void sum(int a, int b)       //2
    {
    	x=a;
    	y=b;
    	System.out.println(x+y);
    }
    
    void sum(double b, int a)   //3
    {
    	x=a;
    	d=b;
    	System.out.println(x+d);
    }
    
    void sum(int b, double a)    //4
    {
    	x=b;
    	d=a;
    	System.out.println(x+d);
    }
    
	public static void main(String[] args) 
	{
		Polymorphism_MethodOverloading m=new Polymorphism_MethodOverloading();
		m.sum();          //1
		m.sum(10, 15);    //2
		m.sum(20, 10.5);  //4
		m.sum(10.5,10);   //3
		
	}

}

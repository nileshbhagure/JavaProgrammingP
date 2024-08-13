package statickeyword;
/*
 static- 
   when we need to share common data
   Avoid duplication & updation(at every location)
1) static methods can access static stuff directly ( without object).
2) static methods can access non-static stuff through object
3) non-static methods can access everything directly. 
 
 */
public class Staticdemo
{
   static int a=10;   //static variable
   int b=20;         //non-static variable
   
	static void m1()   //static
	{
		System.out.println("This is m1 Static Method");
	}
	
	void m2()
	{
		System.out.println("This is m2 Non-Static Method");
	}
	
	void m() //Non-static method
	{
	//3) non-static methods can access everything directly. 
      System.out.println(a);
      System.out.println(b);
      m1();
      m2();
		
	}
	
	/*
	// *1.If we have main method in same class we can acess static vaariable/method directly
	// *2. If main method is in different class in order to access static variable.method with the help of classname we need to call 
	public static void main(String[] args) 
	{
	//1) static methods can access static stuff directly ( without object).
     System.out.println(a);
    //System.out.println(b);  //incorrect because b is non static variable
  
    m1();
    // m2(); //incorrect because b is non-static method

   
   //2) static methods can access non-static stuff through object

   Staticdemo obj=new Staticdemo();
   System.out.println(obj.b);
   obj.m2();
 
   
   	//3) non-static methods can access everything directly. 
     obj.m();
     
   
}     */  
      

}

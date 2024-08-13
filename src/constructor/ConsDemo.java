package constructor;
/*
1) Constructor name should be same as class name.
2) Constructor will never return a value
3) We dont specify the void
4) Constructor can take parameters/arguments
5) Constructor automatically invoked at the time of object creation.
6) used for initilizing the values of the variables.

*/
public class ConsDemo 
{
  int x,y;
  String s;
  
/*ConsDemo()   //not taking any value called default constructor
  {
	  x=100;
	  y=200;
	  s="welcome";
  }*/
  
  ConsDemo(int a, int b, String str)  //parametrised constructor
  {
	  x=a;
	  y=b;
	  s=str;
  }
  
  void displayData()
  {
	  System.out.println(x);
	  System.out.println(y);
	  System.out.println(s);

  }

 public static void main(String args[])
 {
	// ConsDemo s=new ConsDemo();  //invoking default constructor
	 ConsDemo s=new ConsDemo(10,20,"SAI"); //invoking paratermised default constructor. //ARUGMENET
	 s.displayData();
 }
}
package Inheritance_methodoverriding;
/*
 super
1) super keywork invokes immediate parent class variable
2) super keyword invokes immediate parennt class method
3) Used only with inheritance concepts
 */
public class Superkeyword_Animal
{
  String color="Black";
  
  void eat()
  {
	  System.out.println("Eating");
  }

}


class Dog extends Superkeyword_Animal
{
	String color="white"; //overriding variable

     void eat()
     {
    	 super.eat(); //calling immediate parent method
    	 //System.out.println("Dog eating bread");
     }
  
     void displayColor()
     {
    	 System.out.println(super.color);  //invoves parent class variable //white
     }
}
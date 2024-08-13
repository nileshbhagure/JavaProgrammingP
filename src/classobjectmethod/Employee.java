package classobjectmethod;
/*
class is collection of attributes and behavior.
 - logical entity

object is an instance of class.
 - physical entity
 
Animal --- Dog, Elephant, Horse etc...
Student --- Kim, David, Scott...
Employee --- John, David, Smith etc..

class
------
-> Logical entity/Blue print
-> will not occupy any space in memory
-> Class contains variables & methods
Class Employee
{
  Variable
  Method
}

object
-----------
-> Physical entity
-> needs space in memory
-> an instance of a class
-> we can create any number of objects for 1 class
-> objects are independent

  new Classname();
  eg new Employee();
      
// emp=ref variable
 * creating new object- new Employee()-     
 Employee emp=new Employee();
         
 */
public class Employee
{
     int eid;
     String name;
     String job;
     int esal;
     
     void display()
     {
    	 System.out.println(eid);
    	 System.out.println(name);
    	 System.out.println(job);
    	 System.out.println(esal);

     }
     
     
 /*  Creating main method in another class- Empdata  
	public static void main(String[] args)
	{
       Employee e1=new Employee();
       e1.eid=007;
       e1.name="Nilesh";
       e1.job="Engineer";
       e1.esal=100000;
       e1.display();
       
       Employee e2=new Employee();
       e2.eid=10;
       e2.name="Harshada";
       e2.job="Research Assoc";
       e2.esal=200000;
       e2.display(); 
     } */
       
}



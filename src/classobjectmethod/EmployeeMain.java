package classobjectmethod;

public class EmployeeMain 
{
	    //If class is different pkg then we need to import pkg
    	//calling directly if class is same pkg
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
	     } 
	       
	

}

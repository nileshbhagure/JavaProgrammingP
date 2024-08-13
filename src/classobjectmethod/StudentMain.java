package classobjectmethod;

public class StudentMain {

	public static void main(String[] args) 
 	{
	// Student s1=new Student();  //Creating obj of Student class
	 
	/* //Approch 1- using reference variable
	  s1.sid=109;
	  s1.sname="Shiv";
	  s1.grade='A'; */
	  
	  //Approch 2: using method
	 //s1.setData(110, "Meet", 'B'); 
	 
	 //Approach 3- using constructor
	 /* constructor should have same name of class name
	   -constructor will be invoked/call at time of object creation. No need to called explictly
	   -does not return any value- not even void
	   -only used to assign value into variable, no logic is wrriten */
	  
		Student s1=new Student(111, "Viraj", 'c');  //object creation plus we are passing data to constructor
	 
	    s1.show();
	 
      
	}

}

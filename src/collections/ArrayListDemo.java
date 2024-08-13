package collections;
/*
Collections
Collection - To represent group of elements/objects/data into single entity then go for collections.

"Collection" is interface which is available in java.util package..
its root interface. all other interface are derived from Collection

Arrays limitations
--------
1) Size of array is fixed
2) Heterogenious data not allowed ( multiple data values)

ArrayList - is class implemeted List interface
-----
1) Heterogenious data - allowed(data in different form/type)
2) Insertion order- preserved(Index)
3) Duplicate elements -- allowed
4) multiple nulls -- allowed
5)can store primitive & non primitive(objects) data
Searching element is faster in arraylist due to indexing
 */

import java.util.ArrayList;
import java.util.List;


class Employee
{
	int empno;
	String empname;
	
	void disp()
	{
		
	}
}

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
	   //1.declaration
         ArrayList mylist=new ArrayList();
       
       //Not supported to store only similar type of data add wrappper class
      // ArrayList <String> mylist=new ArrayList<String>();  //arraylist allowed to store only string
     
     //Creating the ArrayList object & storing in List Interface vvariable
	  // List mylist=new ArrayList(); //allowed but we cannot create object of List Interface
	
      Employee empobj1=new Employee();
         
	//2. adding data element into arraylist
         mylist.add(100);
         mylist.add(10.5);
         mylist.add("welcome");
         mylist.add(true);
         mylist.add(100);
         mylist.add(null);
         mylist.add(null);
     //  mylist.add(empobj1);   //storing the obj

     // 3. finding the size of array
      System.out.println(mylist.size()); //7
      
     //4. Printing the Arraylist 
         System.out.println(mylist);  //[100, 10.5, welcome, true, 100, null, null]

     //5. remove value from arraylist
         mylist.remove(3);
         System.out.println("After removing element "+mylist); //[100, 10.5, welcome, 100, null, null]
         
      //6.inserting new element in the middle of the list  
         //add will add element at the end of the list
         //insert will insert element at position specific
	
         mylist.add(2, "java");  
         System.out.println("After insertion "+mylist); //100, 10.5, java, welcome, 100, null, null]
	
         //7. Capture specific value from list
	    System.out.println(mylist.get(2)); // //java
	
	    //8.To read all the data from the arraylist
	      for(Object x:mylist)
	      {
	    	  System.out.println(x);
	      }
	      
	      //9. clear all the data from arraylist
	      mylist.clear();   //clear all the data from list
	      System.out.println("After clearing" +mylist);  //[]
	      
	      
	}

}

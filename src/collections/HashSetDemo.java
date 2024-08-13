package collections;
import java.util.HashSet;

/*
 HashSet   - a class implemented Set interface
---------
1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed
 insertion is not possible in hashset
 getting specific value from hashset not possible

 */
public class HashSetDemo {

	public static void main(String[] args) 
	{
     // 1. Declaration
	   HashSet myset=new HashSet();
	
   //  Set myset=new HashSet();   //Creating the ref variable of set
	// HashSet <Integer> myset=new HashSet <Integer>();  //stores only homogeneous data
	
	//2. Adding the data
	   myset.add(100);
	   myset.add(10.5);
	   myset.add("welcome");
	   myset.add(100);
	   myset.add(null);
	   myset.add(null);
	
	 //3.print the set
	   System.out.println(myset);  // removing duplicates, null, insertion order not preserved [null, 100, 10.5, welcome] 

	//4. finding the size of set
	   System.out.println(myset.size());  //4
	
	//5.Removing the value from hashset
	   myset.remove(10.5); //we have to pass directly value but no index- index wont support here
	   System.out.println("after removing value "+myset); //[null, 100, welcome]

	//insertion is not possible in hashset
	
	//get specific value from hashset not possible
	  
	//6. Reading the individual value
	   for(Object x: myset)
	   {
		   System.out.println(x);
	   }
	
	}

}

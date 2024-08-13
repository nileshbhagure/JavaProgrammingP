package collections;

import java.util.HashMap;
import java.util.Map;

/*
 
HashMap - a class implemented Map interface
--------------
Data can be stored in the form of key, value pairs.
Key is unique. But we can have duplicate values.
Insertion order not preserved(Index not followed)
 */
public class HashMapDemo 
{

	public static void main(String[] args) {

	//1 Declaration
	//HashMap hm=new HashMap();
	  //Map hm=new HashMap();
		
	// If we want all key-Int form & value in String format
		HashMap <Integer, String> hm=new HashMap<Integer,String>();
	
	//2. Adding the data into pairs to hashmao
		 hm.put(101, "nilesh");
		 hm.put(102, "harshal");
		 hm.put(103, "meet");
		 hm.put(104, "viraj");
		 hm.put(102, "nilesh");

	//3. printing the hashmap      //will takes latest record by removing the duplicates key
		 //key cannot be duplicate but value can be duplicates
		 System.out.println(hm);  //{101=nilesh, 102=nilesh, 103=meet, 104=viraj}
		 
   // 4. No of pairs 
		 System.out.println(hm.size()); //4
	
	///5 . Removing the pairs
		 hm.remove(103);  //enter pair will be remove. not indidivial value we can remove
		 System.out.println("After removing "+hm); //101=nilesh, 102=nilesh, 104=viraj
	
	// 6.Reterving the value- by passing the key
		 System.out.println(hm.get(102)); //nilesh
	
	// 7. Print only key from hashmap
	   System.out.println(hm.keySet());  //[101, 102, 104]

	   //to print only value we dont have any method. we need using loop
	  //8   print the value from hashmap
	  
	   for(Object x:hm.keySet())
	   {
		   System.out.println(hm.get(x));
	   }
	   
	   //9. Printing key & value
	   for(Object k:hm.keySet())
	   {
		   System.out.println(k+"  "+hm.get(k));
	   }
	   
	   //10 clear the hashmap
	   hm.clear();
	   System.out.println(hm);//{}
	}

}

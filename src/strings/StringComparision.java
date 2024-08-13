package strings;
//Difference betn == and equals
public class StringComparision {

	public static void main(String[] args) {
    /*
	String s1="welcome";
    String s2="welcome";
    
    
    //case 1: No difference- As object is not create using new keyword, 
     *       // both s1 & s2 will point to single object
    // we used == for premitative data  int char float
    System.out.println((s1==s2));   //true
    
    //we used in non-premitative datatype, 
    //compare the object- string compare between object - like stringcomparision, Arrays, Setcomparsion
    System.out.println(s1.equals(s2)); */ //true
	
   /* //case 2: == will return false as object are created using new keyword
            //  s1 & s2 will point to two different object
	String s1=new String("welcome");
    String s2=new String("welcome");
    
    System.out.println(s1);
    System.out.println(s2);
    //creating the object with new keyword
    
    System.out.println((s1==s2));   //false  //compare the objects
    
    System.out.println(s1.equals(s2)); //true  //    //compare the value of the objects */

    
    //case 3
    String s1="abc";
    String s2=new String("abc");
    String s3=s2;
    
    System.out.println(s1);  //abc
    System.out.println(s2);  //abc
    System.out.println(s3);  //abc
	
	System.out.println(s1==s2);  //false
	System.out.println(s1.equals(s2));  //true

	System.out.println(s2==s3); //true
	System.out.println(s2.endsWith(s3)); //true
	}

}

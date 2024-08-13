package strings;
/* String is collection of character
   String is a predefined class
   also we can used as a Datatype
 */
public class StringDemo 
{

	public static void main(String[] args) 
	{
	// using variable
       String s="Nilesh";
       
    //using object of String class
   // String name=new String("Nilesh");
		
     //1.length() - return length of string
      System.out.println("Length of String :"+s.length());  //6
	
	 //2.concat()- joining strings
	String s1="Nilesh";
	String s2=" Suresh";
	String s3=" Bhagure";
	//System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
	
	//3 string concat
	//System.out.println(s1+s2+s3);
    System.out.println(s1.concat(s2).concat(s3));
	
    //trim()- remove right & left side spaces
	s="     automation    ";
	System.out.println(s.trim());
	
	//4.charAr()- return a single char based on index we passed
	            //checked sub String in main String
	s="welcome";
	System.out.println(s.charAt(0));  //w
	System.out.println(s.charAt(2));  //l
	
	//5.contains()- return boolan true/false
    System.out.println(s.concat("wel")); //true
    System.out.println(s.concat("com")); //true
    System.out.println(s.concat("Wel")); //false- String are case sensitive
	
	//6.equals(), equalsIgnoreCase()- compare 2 strings
	//return true or false
	
	s1="WELCOME";
	s2="welcome";
	System.out.println(s1.equals(s2));  //false
	System.out.println(s1.equalsIgnoreCase(s2)); //true- ignore case sensitive
	
	//7.replace()- replace single/mutiple character
	s="welcome to selenium with java automation";
	 
	System.out.println(s.replace('e', 'X'));  //wXlcomX to sXlXnium with java automation
	System.out.println(s.replace("selenium", "playwright")); //welcome to playwright with java automation

	//8.substring()- to extract substring from main string
	// need to spefic starting & ending index
	// 0- starting index
	// 1- ending index
//start	   0123456
	s="welcome";
//end  1234567	
   System.out.println(s.substring(0,2)); //we
   System.out.println(s.substring(2, 5)); //lcom	
   System.out.println(s.substring(0, 6)); //welcom	

	//9.split- divide the string into mutiple parts using delimeter
   // delimeter- means separator. 
   //should not used regular expression * $ ^ ? + - . 
   //below eg @ is delimeter which separate nil and gmail.com 
   s="nil@gmail.com"; 
  String a[]=s.split("@");
  System.out.println(a[0]); //nil
  System.out.println(a[1]); //gmail.com
  
  // s="abc,xyz,def"; // , is delimeter which separate	
	
	//10. toUpperCase(), toLowerCase();
     s="welcome";
     System.out.println(s.toLowerCase());  //welcome
     System.out.println(s.toUpperCase());  //WELCOME
     
	}
	
	
	

}

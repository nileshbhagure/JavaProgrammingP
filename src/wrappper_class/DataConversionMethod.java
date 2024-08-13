package wrappper_class;
/*
 Data Conversion methods- convert data from one form to another
--------------
String s1="10.50";
String s2="20"
String s="true"
     
String  ----> int      Integer.parseInt()
String -----> double   Double.parseDouble()
String ----> boolean   Boolean.parseBoolean()

int phoneno=12312387;

int ----> String   String.valueOf(data)
double--->String   String.valueOf(data)
booelan --->String String.valueOf(data)
char---->String    String.valueOf(data)

String -->char  ( not possible)

 */
public class DataConversionMethod {

	public static void main(String[] args) 
	{

      //String---int
	  //String s="welcome"; //not possible to convert to number
		
		String s1="10";
		String s2="20";
		System.out.println(s1+s2); //1020 perform conconcat
	    System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //30
	
	  //String-->Double
	    String s3="150.11";
	    String s4="142.22";
	    
	    double d1=Double.parseDouble(s3);
	    double d2=Double.parseDouble(s4);
	    System.out.println(s3+s4);         //150.11142.22

	
	    //String-->Boolean
	    String s="true";
	    boolean b1=Boolean.parseBoolean(s);
	    System.out.println(b1); //true
	    
	    
	    //Int, double, char, boolean-->String
	    int a=10;
	    double d=15.15; 
	    char c='A';
	    boolean b=false;
	    
	    //Converting primitive data--> String
	    System.out.println(String.valueOf(a));  //10
	    System.out.println(String.valueOf(d));  //15.15
	    System.out.println(String.valueOf(c));  //A
	    System.out.println(String.valueOf(b));  //false

	}

}

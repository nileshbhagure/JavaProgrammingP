package wrappper_class;
/*
 Wrapper class: 
 The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
 - we can apply build in method 
 - Also used for Data conversion eg String->Number ,vicersa
 For every build in datatype corresponding class is available called as Wrapper class
             WRAPPER CLASS
byte         Byte
short		 Short
int			Integer
long		 Long
float		Float
double		Double
char		Character
booelan		Boolean


String    lenght() substring() trim() etc....
String s="welcome"


 */
public class WrapperDemo 
{

	public static void main(String[] args) 
	{
	/*
    int a=100;  //a is primitive datatype variable
    System.out.println(a);
    
    //wrapper class- we can access other datatype method
    Integer a1=100;  //a1 is Object type variable
    a1.toString();
    System.out.println(a1);  */
	
    //Primitive format
	byte b=10;
	short s=20;
	int i =30;
	long l=40;
	float f=50.0F;
	double d=60.0D;
	char c='a';
	boolean b2=true;
	
	//converting primitive into objects format called Autoboxing
	//creating the wrapper class
	Byte byteobj=b;
	Short shortobj=s;
	Integer intobj=i;
	Long longobj=l;
	Float floatobj=f;
	Double doubleobj=d;
	Character charobj=c;
	Boolean boolobj=b2;	
	
	//Printing the object values
	System.out.println("-----------Printing object Values------------");
	System.out.println("Byte object " + byteobj);
	System.out.println("short object " + shortobj);
	System.out.println("Int object " + intobj);
	System.out.println("long object " + longobj);
	System.out.println("float object " + floatobj);
	System.out.println("Double object " + doubleobj);
	System.out.println("Character object " + charobj);
	System.out.println("Boolean object " + boolobj);

	
	//Converting objects to primitve called Unboxing
	
	byte bytevalue=byteobj;
	short shortvalue=shortobj;
	int intvalue=intobj;
	long longvalue=longobj;
	float floatvalue=floatobj;
	double doublevalue=doubleobj;
	char charvalue=charobj;
	boolean booleanvalue=boolobj;
	
	System.out.println("-----------Printing Primitive Values------------");
	System.out.println("Byte object " + bytevalue);
	System.out.println("short object " + shortvalue);
	System.out.println("Int object " + intobj);
	System.out.println("long object " + longobj);
	System.out.println("float object " + floatvalue);
	System.out.println("Double object " + doubleobj);
	System.out.println("Character object " + charobj);
	System.out.println("Boolean object " + boolobj);
	}

}

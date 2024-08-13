package Inheritance_methodoverriding;
 class Bank
 {
	 double roi()
	 {
		 return 0.0;
	 }
 }
 
 class HDFC extends Bank
 {
	 double roi()            //same method of parent just changing the implementation/body 
	 {
		 return 8.60;
	 }
 }
	
 class KOTAK extends Bank
 {
	 double roi()
	 {
		 return 10.20;
	 }
 }
 
 public class OverridingDemo 
 {
	public static void main(String args[]) 
	{
	Bank b1=new Bank();
	System.out.println(b1.roi());
	
	HDFC h1=new HDFC();
	System.out.println(h1.roi()); //8.60
	
	KOTAK k1=new KOTAK();
	System.out.println(k1.roi()); //10.20
	}
}

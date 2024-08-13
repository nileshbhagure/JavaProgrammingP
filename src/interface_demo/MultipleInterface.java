package interface_demo;


public class MultipleInterface implements Interface1,Interface2
{
	@Override
	public void m1() 
	{
		System.out.println("This is m1 from Interface1");
        System.out.println(x);
	}
	
	@Override
	public void m2() 
	{
		System.out.println("his is m2 from Interface2");
        System.out.println(y);
	}
	
	 void m3() 
	{
		System.out.println("his is m3 from MultipleInterface class");
        System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		MultipleInterface obj=new MultipleInterface();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}


}

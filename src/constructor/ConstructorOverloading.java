package constructor;

public class ConstructorOverloading 
{
  int x,y,z;
  double d;
  
  ConstructorOverloading()   //1
  {
	  x=10;
	  y=20;
  }
	
  ConstructorOverloading(int a, int b)  //2
  {
	  x=a;
	  y=b;
  }
  
  ConstructorOverloading(int a, double v)  //3
  {
	  x=a;
	  d=v;
  }
  
  ConstructorOverloading(double v, int a)  //4
  {
	  x=a;
	  d=v;
  }
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);

	}
	
	
	
	public static void main(String[] args) 
	{
		//ConstructorOverloading o=new ConstructorOverloading();  // 1 default constructor will called
		ConstructorOverloading o1=new ConstructorOverloading(11, 20);  //2
		
		o1.display();
	}

}

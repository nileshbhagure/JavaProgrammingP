package polymorphism_methodoverloading;
//whenever we wanted to use same name local variable in order to diiferient between class variable 
//to differientate class variable & local variable
//this keword always represent the class/variable 
//to reduce the memory- uneccessary memory is not created 
public class ThisKeyword 
{
    int x,y; // instance variable/class variable
	
   /* void setData(int x, int y)  //local variable/method variable
    {
    	this.x=x;
    	this.y=y;
    	
    }*/
    
    //constructor
    ThisKeyword(int x, int y)
    {
          this.x=x;
          this.y=y;
    }
    
    void display()
    {
    	System.out.println(x);
    	System.out.println(y);
    }
    
    public static void main(String[] args) 
	{
    	ThisKeyword t=new ThisKeyword(10,20);
    //	ThisKeyword t=new ThisKeyword();
    //	t.setData(10, 20);
    	t.display();

	}

}

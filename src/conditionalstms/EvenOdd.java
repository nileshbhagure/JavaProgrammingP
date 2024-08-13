package conditionalstms;
/*Any no divide by 2 if gives remainder then even no else its odd no
 10%2= 0 remiander so 10 is even no
 5%2=1 remainder so 5 is odd no 
*/
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		if(num%2==0)   //comparsion operator
		{
			System.out.println("Even no");
		}
		else
		{
			System.out.println("Odd no");
		}
	}

}

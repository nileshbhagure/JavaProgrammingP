package conditionalstms;
/*If no is > 0 then Positive no 
 else if no<0 then Negative no
 else no is zero
*/
public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		if(num>0)
		{
			System.out.println("No is Postive no");
		}
		else if(num<0)
		{
			System.out.println("Negative no");
		}
		else           //else block will always executed at last
		{
			System.out.println("No is Zero");
		}
	}

}

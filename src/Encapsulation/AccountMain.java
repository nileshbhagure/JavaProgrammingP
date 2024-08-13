package Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account obj=new Account();
		
		obj.setAcc_no(12345);
		obj.setName("Nil");
	    obj.setAmount(50000); 
	    
	    System.out.println(obj.getAcc_no());
	    System.out.println(obj.getName());
	    System.out.println(obj.getAmount());
	}
}

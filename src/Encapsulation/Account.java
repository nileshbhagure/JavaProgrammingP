package Encapsulation;
/*
 Encapsulation
---

wrapping up of data and methods in to single unit(class).
all variables should be private.
we can access private variables only through methods(setters & getters)
Shortcut: Source->Generate Getters and Setters
 */
public class Account 
{
    private int acc_no;
    private String name;
    private double amount;
    
    //we need to declared setter/getter method for each individual variable
    
    //Setter- set the data
    	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
    
    //Getter- get the data
    	public int getAcc_no() {
			return acc_no;
		}

    	public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public double getAmount() {
			return amount;
		}

		

}

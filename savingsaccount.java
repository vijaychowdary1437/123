package vijay.com;

public class savingsaccount {
	String acnt_holder_name;
     int acnt_no;
	 int balance;
	 int credit_balance;
	
	savingsaccount(){
		this.acnt_holder_name="vijay chowdary";
		this.balance=5000;
	}
    public savingsaccount(String acnt_holder_name, int acnt_no, int balance, int credit_balance) {
    	super();
	
		this.acnt_holder_name= acnt_holder_name;
		this.acnt_no= acnt_no;
		this.balance= balance;
		this.credit_balance= credit_balance;
		
	}
    public static void main(String[] args) {
    	{
    		System.out.println("vijay chowdary");
    		System.out.println("5000");
    	}
    }
  

} 
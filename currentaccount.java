/**
 * 
 */
package vijay.com;

/**
 * @author Hp
 *
 */
public class currentaccount {
	String acnt_hoder_name;
	private int acnt_balance;
	private int debit_balance;
	private int acnt_no;
	 
	 currentaccount(){
		 
		 this.acnt_hoder_name="vijay chowdary";
		 this.acnt_balance=3000;
		 
	 }
		

	public currentaccount(String acnt_hoder_name, int acnt_balance, int debit_balance, int acnt_no) {
		super();
		this.acnt_hoder_name = acnt_hoder_name;
		this.acnt_balance = acnt_balance;
		this.debit_balance = debit_balance;
		this.acnt_no = acnt_no;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("vijay chowdary");
		System.out.println("3000");

	}

}

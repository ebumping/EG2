package bankingAcct;

public class CheckingAccount extends Account{
	
	public CheckingAccount(){
		setAccountId("DJ300");
		setAccountType("Checking");
		setBalance (300);
		setFirstName("Dylan");
		setLastName("Jeffery");
	}
	
	public void withdraw (int x){	
		if(balance > x){
			balance = (balance - x);		
		}else{
			 System.out.println("Insufficient funds, the check bounces");
		}
	}

}

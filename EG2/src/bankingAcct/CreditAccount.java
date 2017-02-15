package bankingAcct;

public class CreditAccount extends Account{
	
	public CreditAccount(){
		setAccountId("DJCRDT");
		setAccountType("Credit");
		setFirstName("Dylan");
		setLastName("Jeffery");
		
	}
	public void withdraw(int x){
		balance = ((x *.43*30)/100)+x;
	}
	public String toString(){
		return new StringBuilder("Account ID : ").append(getAccountId()).append("\nType : ").append(getAccountType()).append("\n")
				.append(getFirstName()).append(" ").append(getLastName()).append("\nMonthly Total Due : ").append(getBalance()).toString();
	}

}

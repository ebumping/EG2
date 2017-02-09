package bankingAcct;

public class Account {
	private String AccountId;
	private String AccountType;
	private String firstName;
	private String lastName;
	private int balance;
	
	public String getAccountId() {
		return AccountId;
	}
	
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
	
	public String getAccountType() {
		return AccountType;
	}
	
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int deposit(){
		int deposit = 200;
		return balance + deposit;
	}
	
	public void withdraw(){
		
		
	}
	
	public void summary(){
		
	}
	
	public String toString(){
		return "ID : " + this.AccountId + "\nType : " + this.AccountType + "\n" + this.firstName + this.lastName + 
				"Balance : " + this.balance;
	}
	
	public static void main(String[] args){
		Account a = new Account();
		System.out.println(a);
	}

}

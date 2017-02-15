package bankingAcct;

public class Account {

	private String accountId;
	private String accountType;
	private String firstName;
	private String lastName;
	protected double balance;
	/*protected int deposit;
	protected int withdraw;
	
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}*/

	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int x){
		balance = balance + x;
	}
	
	public void withdraw(int x){
		balance = balance - x;
	}
	
	public void summary(){
		
	}
	
	public Account(String accountId, String accountType, String firstName, String lastName, double balance){
		this.accountId = accountId;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		//this.deposit = deposit + balance;
		//this.withdraw = (balance + deposit) - withdraw;
	}


	public Account(){
		
	}
	
	public String toString(){
		return new StringBuilder("Account ID : ").append(getAccountId()).append("\nType : ").append(getAccountType()).append("\n")
				.append(getFirstName()).append(" ").append(getLastName()).append("\nBalance : ").append(getBalance()).toString();
	}
	

}

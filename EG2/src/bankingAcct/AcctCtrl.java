package bankingAcct;

public class AcctCtrl {
	public static void main(String[] args){
		Account a1 = new Account("XXX", "Savings", "Test", "Test" , 20);
		System.out.println(a1);
		a1.deposit(300);
		System.out.println(a1);
		
		CheckingAccount a2 = new CheckingAccount();
		System.out.println(a2);
		a2.withdraw(100);
		System.out.println(a2);
		a2.withdraw(10000);
		
		CreditAccount a3 = new CreditAccount();
		a3.withdraw(1000);
		System.out.println(a3);
	}

}

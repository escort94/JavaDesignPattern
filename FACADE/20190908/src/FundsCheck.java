
public class FundsCheck {

	private double cashInAccount = 1000.00;
	
	public double getCashInAccount() { return cashInAccount;}
	
	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}
	public boolean haveEnoughtMoney(double cashToWithdrawal) {
		if(cashToWithdrawal > getCashInAccount() ) {
			System.out.println("Error: You don't have enough money");
			System.out.println("Current Balance: " + getCashInAccount());
			
			return false;
		} else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdrawal Complete: Cureent Balance is " + getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit Complet: Current Balance is " + getCashInAccount());
		
	}
}

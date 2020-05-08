
public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomToBank bankWelcome;
	
	public BankAccountFacade(int newAcctNum, int newSecCode) {
		accountNumber = newAcctNum;
		securityCode = newSecCode;
		
		bankWelcome = new WelcomToBank();
		
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}
	
	public int getAccountNumber() { return accountNumber;}
	
	public int getSecurityCode() { return securityCode;}
	
	public void withdrawCash(double chashToGet) {
		if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())&& fundChecker.haveEnoughMoney(chashToGet)) {
			
			System.out.println("Transaction Complete");
		} else {
			System.out.println("Transaction Failed");
		}
	}
	
	public void depositCash(double cashToDeposit) {
		if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())) {
			
			fundChecker.makeDeposit(cashToDeposit);
			System.out.println("Transaction Complete");
		} else {
			System.out.println("Transaction Failed");
		}
	}
}

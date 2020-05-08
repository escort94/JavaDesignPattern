
public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;

	public BankAccountFacade(int accountNumber, int securityCode) {
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;
		
		this.bankWelcome = new WelcomeToBank();
		
		this.acctChecker = new AccountNumberCheck();
		this.codeChecker = new SecurityCodeCheck();
		this.fundChecker = new FundsCheck();
	}
	
	public int getAccountNumber() {return this.accountNumber;}
	public int getSecurityCode() {return this.securityCode;}
	
	public void withdrawCash(double cashToGet) {
		if(acctChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(getSecurityCode()) &&
				fundChecker.haveEnoughtMoney(cashToGet))
		{
			System.out.println("Transaction Complete \n");
			
		} else {
			System.out.println("Transaction Failed\n");
		}
	}
	
	public void depositCash(double cashToDeposit) {
		if(acctChecker.accountActive(getAccountNumber()) && 
				codeChecker.isCodeCorrect(getSecurityCode())) {
			
			fundChecker.makeDeposit(cashToDeposit);
			
			System.out.println("Transaction Complete \n");
		} else {
			System.out.println("Transaction Failed\n");
		}
	}
	
}

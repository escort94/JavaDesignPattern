
public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
		accessingBank.withdrawCash(50.00);
		accessingBank.withdrawCash(990.00);

	}

}

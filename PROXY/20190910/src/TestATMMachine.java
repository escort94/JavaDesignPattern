
public class TestATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATMMachine atmMachine = new ATMMachine();
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.requestCash(2000);
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		
		GetATMData realATMMachine = new ATMMachine();
		GetATMData atmProxy = new ATMProxy();
		System.out.println("Current ATM State " + atmProxy.getATMState());
		System.out.println("Cash in ATM Machine $"+ atmProxy.getCashInMachine());
		
	}

}

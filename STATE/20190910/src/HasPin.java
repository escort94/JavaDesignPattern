
public class HasPin implements ATMState {

	ATMMachine atmMachine;

	public HasPin(ATMMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("You already entered a card");
	}

	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("You already entered a PIN");
	}

	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		if(cashToWithdraw > atmMachine.cashInMachine) {
			System.out.println("You don't have that much cash available");
			System.out.println("Your card is ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		} else {
			System.out.println(cashToWithdraw + " is provided by the machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			
			System.out.println("Your card is ejected");
			
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <= 0) {
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
	}
	
	
	
}


public class HasPin implements ATMState {

	ATMMachine atmMachine;
	
	public HasPin(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("You already entered a card");

	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
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

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("You already entered a PIN");

	}

}

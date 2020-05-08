public class NoCard implements ATMState {

	ATMMachine atmMachine;
	
	
	public NoCard(ATMMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Please enter your pin");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("You didn't enter a card");
	}

	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("You have not entered your card");
	}

	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("You have not entered your card");
	}

	
}

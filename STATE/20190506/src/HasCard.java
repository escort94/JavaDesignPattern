
public class HasCard implements ATMState {

	ATMMachine atmMachine;

	public HasCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("You can only insert one card at a time");
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());

	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		if (pinEntered == 1234) {
			System.out.println("You entered the correct PIN");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		} else {
			System.out.println("You entered the wrong PIN");
			atmMachine.correctPinEntered = false;
			System.out.println("Your card is ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("Your have not enterd your PIN");
	}

}

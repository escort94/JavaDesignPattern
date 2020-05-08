import javax.swing.plaf.synth.SynthSeparatorUI;

public class NoCard implements ATMState {

	ATMMachine atmMachine;
	
	public NoCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Please enter your pin");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("You didn't enter a card");
	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("You have not entered your card");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("You have not entered your card");
	}

}

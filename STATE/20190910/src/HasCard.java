
public class HasCard implements ATMState {

	ATMMachine atmMachine;
	
	
	public HasCard(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}

	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("You can only insert one card at a time");
	}

	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("You have not entered your PIN");
		
	}

	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		if(pinEntered == 1234) {
			System.out.println("You entered the correct PIN");
			atmMachine.correntPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		}
	}


}

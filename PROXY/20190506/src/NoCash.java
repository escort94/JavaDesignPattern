
public class NoCash implements ATMState{

	ATMMachine atmMachine;
	
	public NoCash(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}
	@Override
	public void insertCard() {
		System.out.println("We don't have any money");
		System.out.println("Your card is ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
		
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("We don't have any money");
		System.out.println("There is no card to eject");
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("We don't have any money");
		
	}

	@Override
	public void requestCash(int chahToWithdraw) {

		System.out.println("We don't have any money");
		
	}

}

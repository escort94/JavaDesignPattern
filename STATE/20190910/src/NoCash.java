
public class NoCash implements ATMState {

	ATMMachine atmMachine;
	
	public NoCash(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("We don't have any money");
		System.out.println("Your card is ejected");
	}

	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("We don't have any money");
		System.out.println("There is no card to eject");
	}
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("We don't have any money");
		
	}

	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("We don't have any money");
	}

}

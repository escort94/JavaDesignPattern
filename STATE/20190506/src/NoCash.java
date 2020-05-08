import javax.swing.plaf.synth.SynthSeparatorUI;

public class NoCash implements ATMState{

	ATMMachine atmMachine;
	
	
	public NoCash(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("We don't have any mondy");
		System.out.println("Your card is ejected");
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("We don't have any money");
		System.out.println("There is no card to eject");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("We don't have any money");
		
	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("We don't have any money");
	}

}

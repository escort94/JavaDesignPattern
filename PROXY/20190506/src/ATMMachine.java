
public class ATMMachine implements GetATMData {

	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState noCash;
	ATMState atmState;
	
	public ATMState getYesCardState() {return hasCard;}
	public ATMState getNoCardState() {return noCard;}
	public ATMState getHasPin() {return hasCorrectPin;}
	public ATMState getNoCashState() {return noCash;}
	
	int cashInMachine =  2000;
	boolean correctPinEntered = false;
	
	public ATMMachine() {
		this.hasCard = new HasCard(this);
		this.noCard = new NoCard(this);
		this.hasCorrectPin = new HasPin(this);
		this.noCash = new NoCash(this);
		
		atmState = noCard;
		
		if(cashInMachine < 0) {
			atmState = noCash;
		}
	}
	
	void setAtmState(ATMState newATMState) {
		atmState = newATMState;
	}
	
	public void insertCard() {
		atmState.insertCard();
	}
	
	public void ejectCard() {
		atmState.ejectCard();
	}
	
	public void requestCash(int cashToWithdraw) {
		atmState.requestCash(cashToWithdraw);
	}
	public void insertPin(int pinEntered) {
		atmState.insertPin(pinEntered);
	}
	
	void setATMState(ATMState newATMState ) {
		atmState = newATMState;
	}
	@Override
	public ATMState getATMState() {
		// TODO Auto-generated method stub
		return atmState;
	}

	@Override
	public int getCashInMachine() {
		// TODO Auto-generated method stub
		return cashInMachine;
	}
	public void setCashInMachine(int newCashInMachine) {
		cashInMachine = newCashInMachine;
	}
	
	

}


public class ATMProxy implements GetATMData{

	@Override
	public ATMState getATMState() {
		// TODO Auto-generated method stub
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getATMState();
	}

	@Override
	public int getCashInMachine() {
		// TODO Auto-generated method stub
		ATMMachine realATMMAchine = new ATMMachine();
		return realATMMAchine.getCashInMachine();
	}

}

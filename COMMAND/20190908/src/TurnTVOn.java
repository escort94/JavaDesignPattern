
public class TurnTVOn implements Command {

	ElectronicDevice theDevice;
	
	
	public TurnTVOn(ElectronicDevice theDevice) {
		this.theDevice = theDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.on();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		theDevice.off();
		
	}

}

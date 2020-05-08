
public class TurnTVOn implements Command {

	ElectronicDevice theDevice;
	
	public TurnTVOn(ElectronicDevice theDevice) {
		
		this.theDevice = theDevice;
	}

	public void execute() {
		// TODO Auto-generated method stub
		theDevice.on();
	}

	public void undo() {
		// TODO Auto-generated method stub
		theDevice.off();
	}

}

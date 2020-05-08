
public class TurnTVOff implements Command {

	ElectronicDevice theDevice;
	
	public TurnTVOff(ElectronicDevice theDevice) {
	
		this.theDevice = theDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theDevice.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		theDevice.on();
	}

}

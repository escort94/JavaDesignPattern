
public class TurnTVUp implements Command {

	ElectronicDevice theDevice;
	
	
	public TurnTVUp(ElectronicDevice newDevice) {
		// TODO Auto-generated constructor stub
		theDevice = newDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		theDevice.volumeUp();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		theDevice.volumeDown();
	}

}

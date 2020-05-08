import java.util.List;

public class TurnItAllOff implements Command {

	
	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> theDevices) {
		super();
		this.theDevices = theDevices;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(ElectronicDevice device : theDevices) {
			device.off();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(ElectronicDevice device : theDevices) {
			device.on();
		}
	}

}

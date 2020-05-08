import java.util.List;

public class TurnItAllOff implements Command {

	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> theDevices) {
		this.theDevices = theDevices;
	}

	public void execute() {

		for(ElectronicDevice device : theDevices) {
			device.off();
		}
	}

	public void undo() {

		for(ElectronicDevice device : theDevices) {
			
			device.on();
		}
	}

}

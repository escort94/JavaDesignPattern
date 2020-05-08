import java.util.List;

public class TurnItAllOff implements Command {

	
	List<ElectronicDevice> theDevices;
	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		// TODO Auto-generated constructor stub
		theDevices = newDevices;
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


public class TVRemotePause extends RemoteButton {

	public TVRemotePause(EntertainmentDevice theDevice) {
		super(theDevice);
	}

	public void buttonNinePressed() {
		System.out.println("TV was Paused");
	}
}

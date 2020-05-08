
public class DVDRemote extends RemoteButton {

	private boolean play = true;
	
	public DVDRemote(EntertainmentDevice theDevice) {
		super(theDevice);
		// TODO Auto-generated constructor stub
	}

	public void buttonNinePressed() {
		play = !play;
		System.out.println("DVD is Plaing : " + play);
	}
	
}

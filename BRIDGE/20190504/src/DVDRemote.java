
public class DVDRemote extends RemoteButton {

	private boolean play = true;
	
	
	public DVDRemote(EntertainmentDevice newDevice) {
		super(newDevice);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void buttonNinePressed() {
		// TODO Auto-generated method stub
		play = !play;
		
		System.out.println("DVD is Playing: " + play);

	}

}

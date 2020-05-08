
public class Radio implements ElectronicDevice {

	private int volume = 0;
	
	public void on() {

		System.out.println("Radio is on");
		
	}

	public void off() {

		System.out.println("Radio is off");
	}

	public void volumeUp() {

		volume++;
		if(volume > 100) volume = 100;
		System.out.println("Radio Volume is at: " + volume);
	}

	@Override
	public void volumeDown() {
		volume --;
		if(volume < 0) volume = 0;
		System.out.println("Radio Volume is at: " + volume);
		
	}

}

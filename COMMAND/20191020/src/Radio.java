
public class Radio implements ElectronicDevice {

	private int volume = 0;
	
	
			
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Radio is on");
	}

	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Radio is off");
	}

	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("Radio Volume is at : " + volume);
	}

	public void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("Radio Volume is at : " + volume);
	}

}

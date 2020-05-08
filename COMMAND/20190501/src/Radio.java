
public class Radio implements ElectronicDevice {

	private int volume = 0;
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Radio is on");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Radio is off");

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		
		System.out.println("Radio Volume is at: " + volume);

	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("Radio Volume is at: " + volume);

	}

}

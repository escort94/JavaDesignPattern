
public class Television implements ElectronicDevice {

	private int volume = 0;
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("TV is On");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV is Off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume ++;
		if(volume > 100) volume = 100;
		System.out.println("TV Volume is at: " + volume);
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		volume --;
		if(volume < 0) volume = 0;
		System.out.println("TV Volume is at: " + volume);
	}

}

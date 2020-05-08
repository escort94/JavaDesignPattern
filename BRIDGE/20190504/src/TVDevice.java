
public class TVDevice extends EntertainmentDevice {

	
	public TVDevice(int newDeviceState, int newMaxSetting) {
		
		// TODO Auto-generated constructor stub
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}

	@Override
	public void buttonFivePressed() {
		// TODO Auto-generated method stub
		System.out.println("Channel Down");
		deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		// TODO Auto-generated method stub
		System.out.println("Channel Up");
		deviceState++;
	}

}

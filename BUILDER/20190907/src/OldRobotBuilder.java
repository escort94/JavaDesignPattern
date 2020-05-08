
public class OldRobotBuilder implements RobotBuilder {

	
	private Robot robot;
	
	public OldRobotBuilder() {
		
		this.robot = new Robot();
	}

	@Override
	public void buildeRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		// TODO Auto-generated method stub
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		// TODO Auto-generated method stub
		robot.setRobotArms("Blowtorch Arms");
	}

	@Override
	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		robot.setRobotLegs("Rollar Skates");
	}

	@Override
	public Robot getRobot() {
		// TODO Auto-generated method stub
		return this.robot;
	}

}


public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;

	
	public OldRobotBuilder() {
	
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {

		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {

		robot.setRobotArms("Blowtorch Arms");
	}

	@Override
	public void buildRobotLegs() {

		robot.setRobotLegs("Rollar Skates");
	}

	@Override
	public Robot getRobot() {
		// TODO Auto-generated method stub
		return robot;
	}

}

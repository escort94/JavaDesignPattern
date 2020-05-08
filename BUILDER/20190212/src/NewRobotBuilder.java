
public class NewRobotBuilder implements RobotBuilder {

	private Robot robot;

	
	public NewRobotBuilder() {
	
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("New Head");
	}

	@Override
	public void buildRobotTorso() {

		robot.setRobotTorso("New Torso");
	}

	@Override
	public void buildRobotArms() {

		robot.setRobotArms("New Arms");
	}

	@Override
	public void buildRobotLegs() {

		robot.setRobotLegs("New Skates");
	}

	@Override
	public Robot getRobot() {
		// TODO Auto-generated method stub
		return robot;
	}

}


public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}
	@Override
	public void buildRobotHead() {
		
		robot.setRobotHead("Tin Head1");
		
	}

	@Override
	public void buildRobotTorso() {

		robot.setRobotTorso("Tin Torso1");
		
	}

	@Override
	public void buildRobotArms() {
 
		robot.setRobotArms("Blowtorch Arms1");
		
	}

	@Override
	public void buildRobotLegs() {

		robot.setRobotLegs("Rollar Skates1");
		
	}

	@Override
	public Robot getRobot() {
		
		return this.robot;
	}

}

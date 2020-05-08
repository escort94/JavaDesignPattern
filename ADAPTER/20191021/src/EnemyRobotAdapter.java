
public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot theRobot) {
		
		this.theRobot = theRobot;
	}

	public void fireWeapon() {
		// TODO Auto-generated method stub
		theRobot.smashWithHands();
		
	}

	public void driveForward() {
		// TODO Auto-generated method stub
		theRobot.walkForward();
		
	}

	public void assignDriver(String driverName) {
		// TODO Auto-generated method stub
		theRobot.reactToHuman(driverName);
	}

}

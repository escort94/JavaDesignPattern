
public class EnemyShipTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
		
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
		
		System.out.println(theBoss + "\n");
	}

}

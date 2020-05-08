
public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		// TODO Auto-generated method stub
		EnemyShip theEnemyShip = null;
		
		if(typeOfShip.equals("UFO")) {
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Gurnt Ship");
		} else if(typeOfShip.equals("UFO BOSS")) {
			EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
			theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Boss Ship");
		}
		return theEnemyShip;
	}

}


public abstract class EnemyShipBuilding {

	protected abstract EnemyShip makeEnemyShip(String string);
	
	public EnemyShip orderTheShip(String typeOfShip) {
		EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
		
		theEnemyShip.makeShip();
		theEnemyShip.displayEnemyShip();
		theEnemyShip.followHeroShip();
		theEnemyShip.enemyShipShoots();
		
		return theEnemyShip;
	}

}

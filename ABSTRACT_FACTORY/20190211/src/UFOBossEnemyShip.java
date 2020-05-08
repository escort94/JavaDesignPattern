
public class UFOBossEnemyShip extends EnemyShip {

	EnemyShipFactory shipFactory;
	
	public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}

	void makeShip() {

		System.out.println("Maing enemy ship " + getName());
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
	}

}

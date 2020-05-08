
public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory shipFactory;
	
	
	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		super();
		this.shipFactory = shipFactory;
	}


	@Override
	void makeShip() {
	
		System.out.println("Making enemy ship " + getName());
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
		
	}

}

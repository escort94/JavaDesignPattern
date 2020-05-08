
public class UFOEnemyShipFactory implements EnemyShipFactory{

	public ESWeapon addESGun() {
		// TODO Auto-generated method stub
		return new ESUFOGun();
	}

	public ESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new ESUFOEngine();
	}

}

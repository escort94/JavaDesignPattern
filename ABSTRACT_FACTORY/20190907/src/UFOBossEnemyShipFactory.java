
public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	public ESWeapon addESGun() {
		// TODO Auto-generated method stub
		return new ESUFOBossGun();
	}

	public ESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new ESUFOBossEngine();
	}



}

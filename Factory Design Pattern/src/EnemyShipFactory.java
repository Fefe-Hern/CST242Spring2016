
public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip newShip = null;
		if(newShipType.equals("U")){
			return new UFOEnemyShip();
		} else if( newShipType.equals("R")){
			return new RocketEnemyShip();
		} else if( newShipType.equals("H")) {
			return new HugeUFOEnemyShip();
		} else {
			return null;
		}
				
	}
}

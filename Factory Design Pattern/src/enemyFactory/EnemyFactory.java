package enemyFactory;

public class EnemyFactory {
	
	public Enemy makeAnEnemy(String enemyType) {
		if(enemyType.equals("Soldier")) {
			return new Soldier();
		} else if (enemyType.equals("Commander")) {
			return new Commander();
		} else {
			return new Enemy();
		}
	}
}

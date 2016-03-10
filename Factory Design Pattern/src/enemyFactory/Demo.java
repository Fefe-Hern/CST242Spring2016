package enemyFactory;

public class Demo {

	public static void main(String[] args) {
		EnemyFactory ef = new EnemyFactory();
		Enemy s = ef.makeAnEnemy("Soldier");
		System.out.println(s);
		Enemy c = ef.makeAnEnemy("Commander");
		System.out.println(c);
		Enemy e = ef.makeAnEnemy("whatever");
		System.out.println(e);
	}
}

import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		while (true) {
			System.out.println("What type of ship? (U/R/H)");
			if(userInput.hasNextLine()) {
				String typeOfShip = userInput.nextLine();
				theEnemy = shipFactory.makeEnemyShip(typeOfShip);
				if(theEnemy != null) {
					doStuffEnemy(theEnemy);
				} else {
					System.out.println("Please enter U, R, or H next time. ");
				}
			}
		}
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		anEnemyShip.displayEnemeyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}

}

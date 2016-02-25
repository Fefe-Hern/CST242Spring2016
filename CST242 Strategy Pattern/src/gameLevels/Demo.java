package gameLevels;

public class Demo {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setAbilityLevel(new Level1());
		hero.travel();
		hero.handleWeapons();
		hero.protect();
		System.out.println();
		hero.setAbilityLevel(new Level2());
		hero.travel();
		hero.handleWeapons();
		hero.protect();
		

	}

}

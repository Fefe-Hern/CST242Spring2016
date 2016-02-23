
public class Demo {

	public static void main(String[] args) {
		Hero hero = new Hero("Mario");
		hero.setAbility(new Level1());
		hero.travel();
		hero.handleWeapon();
		hero.protect();
		System.out.println("---Hero Line-------");
		hero.setAbility(new Level2());
		hero.travel();
		hero.handleWeapon();
		hero.protect();
		System.out.println("---Hero Line-------");
		hero.setAbility(new Level3());
		hero.travel();
		hero.handleWeapon();
		hero.protect();
	}

}

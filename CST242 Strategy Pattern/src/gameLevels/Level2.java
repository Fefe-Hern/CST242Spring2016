package gameLevels;

public class Level2 implements Ability{

	@Override
	public void travel() {
		System.out.println("I travel by bike.");
	}

	@Override
	public void handleWeapons() {
		System.out.println("I have a knife");
	}

	@Override
	public void protect() {
		System.out.println("I wear a long sleeve shirt");
	}

}

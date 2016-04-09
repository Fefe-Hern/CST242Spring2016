package gameLevels;

public class Level3 implements Ability{

	@Override
	public void travel() {
		System.out.println("I travel on Humvee.");
	}

	@Override
	public void handleWeapons() {
		System.out.println("I have a 0.28 automatic.");
	}

	@Override
	public void protect() {
		System.out.println("I wear a body armor");
	}

}

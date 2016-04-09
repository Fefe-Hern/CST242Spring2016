package gameLevels;

public class Level1 implements Ability{

	@Override
	public void travel() {
		System.out.println("I travel on foot.");
	}

	@Override
	public void handleWeapons() {
		System.out.println("I fight with bare fists.");
	}

	@Override
	public void protect() {
		System.out.println("I wear a T shirt");
	}

}

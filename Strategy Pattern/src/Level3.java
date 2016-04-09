
public class Level3 implements Ability {

	@Override
	public void travel() {
		System.out.println("I fly F-22");
	}

	@Override
	public void handleWeapon() {
		System.out.println("I have a nuke. Nuke Them!");
	}

	@Override
	public void protect() {
		System.out.println("I wear body armor");
	}

}

package gameLevels;

public class Hero {
	private Ability ability;
	
	public void setAbilityLevel(Ability ability) {
		this.ability = ability;
	}
	
	public void travel() {
		ability.travel();
	}

	public void handleWeapons() {
		ability.handleWeapons();
	}

	public void protect() {
		ability.protect();
	}

}

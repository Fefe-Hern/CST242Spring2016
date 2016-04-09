
public class Hero {
	
	private String name;
	private Ability ability;
	
	public Hero(String name) {
		this.name = name;
	};
	
	public void setAbility(Ability ability) {
		this.ability = ability;
	}
	
	public void travel() {
		this.ability.travel();
	}
	
	public void handleWeapon() {
		this.ability.handleWeapon();
	}
	
	public void protect() {
		this.ability.protect();
	}
	
	
	
}

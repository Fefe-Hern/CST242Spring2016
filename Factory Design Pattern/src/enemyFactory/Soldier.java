package enemyFactory;

public class Soldier extends Enemy {
	public Soldier() {
	super();
	setHeight(6);
	setWeight(200);
	setColor("RED");
	}
	
	public String toString() {
		return "Soldier:\n\tWeight: " + getWeight() + 
						"\n\tHeight: " + getHeight() +
						"\n\tColor: " + getColor();
	}
}

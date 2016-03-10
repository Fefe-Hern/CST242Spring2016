package enemyFactory;

public class Commander extends Enemy {
	public Commander() {
		super();
		setHeight(6.5);
		setWeight(300);
		setColor("GREEN");
	}
	
	public String toString() {
		return "Commander:\n\tWeight: " + getWeight() + 
						"\n\tHeight: " + getHeight() +
						"\n\tColor: " + getColor();
	}
}
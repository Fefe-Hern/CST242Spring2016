package enemyFactory;

public class Enemy {
	private double height = 5;
	private double weight = 100;
	private String color = "Blue";
	
	public Enemy() {};
	
	public Enemy(double h, double w, String c) {
		height = h;
		weight = w;
		color = c;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Enemy:\n\tWeight: " + getWeight() + 
						"\n\tHeight: " + getHeight() +
						"\n\tColor: " + getColor();
	}

}

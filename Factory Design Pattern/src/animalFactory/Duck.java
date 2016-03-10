package animalFactory;

public class Duck implements Animal {


	@Override
	public void makeSound() {
		System.out.println("Quack, Quack");
	}

	@Override
	public void locomotion() {
		System.out.println("Duck Waddles");
	}

}

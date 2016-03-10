package animalFactory;

public class Dog implements Animal {

	@Override
	public void locomotion() {
		System.out.println("Dog runs");
	}

	@Override
	public void makeSound() {
		System.out.println("Woof, woof");
	}

}

package animalFactory;

public class Demo {

	public static void main(String[] args) throws Exception {
		AnimalFarm farm = new AnimalFarm();
		Animal a1 = farm.getAnimal("Dog");
		a1.locomotion();
		a1.makeSound();
		System.out.println();
		Animal a2 = farm.getAnimal("Duck");
		a2.locomotion();
		a2.makeSound();
		System.out.println();
	}
}

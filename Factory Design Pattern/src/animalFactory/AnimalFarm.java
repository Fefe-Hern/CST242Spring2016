package animalFactory;

public class AnimalFarm {
	public Animal getAnimal(String animalType) throws Exception {
	
		switch (animalType) {
		case "Dog":
			return new Dog();
		case "Duck":
			return new Duck();
		default:
			throw new Exception("Animal Type: " +
		animalType + " cannot be instanciated");
	}
	}
}

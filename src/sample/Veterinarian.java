package sample;

public class Veterinarian {
	private String name;
	
	public Veterinarian() {
		
	}
	
	public Veterinarian(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String defineTheAnimalType(Animal animal) {
		String tmp = animal.getClass().toString();
		int index = tmp.indexOf(".");
		
		return tmp.substring(index+1, tmp.length());
	}
	
	public void treatment(Animal animal) {
		System.out.println("The animal "+defineTheAnimalType(animal));
		System.out.println("The weigth is "+animal.getWeight());
		System.out.println("The color is "+animal.getColor());
		System.out.println("It eats "+animal.getRation());
		if(animal.getClass().equals(Cat.class)) {
			Cat cat = (Cat)animal;
			System.out.println("Defining a problem of the cat "+cat.getName());
			System.out.println("---------------------------------------------");
		}
		if(animal.getClass().equals(Dog.class)) {
			Dog dog = (Dog)animal;
			System.out.println("Defining a problem of the dog "+dog.getName());
			System.out.println("---------------------------------------------");
		}
	}
}

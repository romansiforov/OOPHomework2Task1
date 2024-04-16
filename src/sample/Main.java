package sample;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("meat", "greay", 5, "Kuzya");
		Cat cat = new Cat("fresh fish", "red", 2, "Shafranek");
		
		Veterinarian doctor = new Veterinarian("Roman");
		
		doctor.treatment(cat);
		doctor.treatment(dog);

	}

}

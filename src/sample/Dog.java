package sample;

public class Dog extends Animal{
	private String name;
	
	public Dog() {
		
	}
	
	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getVoice() {
		return "Gav gav gav";
	}
	
	@Override
	public void eat() {
		System.out.println("The dog eats "+this.getRation());
	}
	
	@Override
	public void sleep() {
		System.out.println("The dog sleeps when the master ignores it");
	}

}

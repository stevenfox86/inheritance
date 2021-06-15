package regular_inheritance.test2;

public class SuperClassAnimal {

	private String name;
	private int weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
//	only an abstract class or interface can have an abstract method
//	public abstract void walk();
	
	public void walk () {
		System.out.println("The animal is walking");
	};
}

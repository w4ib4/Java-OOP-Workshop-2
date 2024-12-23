package lvl5workshop2;
class Animal{
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Animal");
	}
}
class Dog extends Animal{
	String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
}
public class Q1 {
	public static void main(String[] args) {
		Dog dog = new Dog("Tyco",3,"Golden Retriever");
	}

}

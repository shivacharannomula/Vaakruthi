package day04;
class Animal{
	public void makeSound() {
		System.out.println("Sound....");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Make Sounds....");
	}
}
public class Main2 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.makeSound();
		Cat c = new Cat();
		c.makeSound();         
	}
}

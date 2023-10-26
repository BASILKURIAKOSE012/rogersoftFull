package oops.inheritance;

public class Dog extends Animal {

	// method over riding
	public void sound() {
		super.sound();
		System.out.println("Dog sound");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1 = new Dog();
		d1.sound();
		d1.eat();
	}
}

package oops.interfaces;

public class Dog implements Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.eat();
		d1.sound();
		
		Animal a1 = new Dog();
		a1.eat();
		a1.sound();
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("dog sounds");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eats");
	}
	
	public void name() {
		System.out.println("jimmy");
	}

}

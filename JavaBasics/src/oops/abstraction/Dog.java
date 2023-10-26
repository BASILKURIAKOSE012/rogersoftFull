package oops.abstraction;

public class Dog extends Animal {
	
	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog sounds");
		
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.animalEat();
		d1.animalSound();
		
	}


}

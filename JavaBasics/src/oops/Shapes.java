package oops;

public class Shapes {

	
	// methods
	public void getSquareArea(int side) {
		System.out.println(side * side);
	}

	public void getRectangleArea(int length, int breadth) {
		System.out.println(length * breadth);
	}

	// method overloads
	public void getSum(int a, int b) {
		System.out.println(a + b);

	}

	public void getSum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	// return type method	
	public int getSquareVolume(int side) {

		int volume = side * side * side;
		return volume;

	}

	public static void main(String[] args) {

		Shapes s1 = new Shapes();
		s1.getSquareArea(10);
		s1.getRectangleArea(10, 20);
		s1.getSum(10, 20);
		s1.getSum(10, 20, 30);
		int squareVolume = s1.getSquareVolume(5);
		System.out.println(squareVolume);
	}

}

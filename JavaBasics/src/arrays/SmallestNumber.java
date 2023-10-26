package arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 7, 2, 10, 1, 5 };
		int smallest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("smallest number is " + smallest);

	}

}

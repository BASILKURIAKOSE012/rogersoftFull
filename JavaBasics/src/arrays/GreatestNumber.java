package arrays;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 12, 10, 4, 5 };
		int greatest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > greatest) {
				greatest = numbers[i];
			}
		}
		System.out.println("greatest number is " + greatest);

	}

}

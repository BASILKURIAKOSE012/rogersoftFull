package arrays;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { -1, -3,-6,-4,-1,-2 };
		int smallest = numbers[0];
		int flag = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}

		}
		System.out.println("smallest number is " + smallest);
		int greatest = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {

			set.add(numbers[i]);

		}

		for (int j = 1; j <= greatest; j++) {

			if (set.contains(j)) {

			} else {

				System.out.println(j);
				break;
			}

		}

	}

}

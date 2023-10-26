package arrays;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[5];
		int search;
		int count = 0;
		System.out.println("Enter 5 numbers");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("Enter the search term");
		search = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (search == numbers[i]) {
				count++;

			}
		}
		if (count > 0) {
			System.out.println("search term is present");
		} else {
			System.out.println("search term is not present");
		}
		System.out.println("number of time search term repeated is " + count);
	}

}

package basics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  mark");
		x = sc.nextInt();
		if (x >= 90 && x <= 100) {
			System.out.println(" you have A+ Grade");
		} else if (x >= 80 && x < 90) {
			System.out.println(" you have A Grade");

		} else if (x >= 70 && x < 80) {
			System.out.println(" you have B+ Grade");

		} else if (x >= 60 && x < 70) {
			System.out.println(" you have B Grade");

		} else if (x >= 50 && x < 60) {
			System.out.println(" you have C+ Grade");

		} else if (x >= 40 && x < 50) {
			System.out.println(" you have C Grade");

		} else if (x < 40 && x >= 0) {
			System.out.println(" you are failed");

		}
		else {
			System.out.println("Invalid mark");
		}
	}

}

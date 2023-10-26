package loops.whiles;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int x;
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		x = sc.nextInt();
		while (x >= i) {
			factorial *= x;
			x--;
		}
		System.out.println(factorial);
	}

}

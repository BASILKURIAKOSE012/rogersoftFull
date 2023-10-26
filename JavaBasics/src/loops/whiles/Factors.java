package loops.whiles;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		x = sc.nextInt();
		int i = 1;
		while (i < x) {
			if (x % i == 0) {
				System.out.println( i);
			}
			i++;
		}
	}

}

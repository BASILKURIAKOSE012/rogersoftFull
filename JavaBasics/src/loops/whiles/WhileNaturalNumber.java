package loops.whiles;

import java.util.Scanner;

public class WhileNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		while ( i <= n) {
			System.out.println(i);
			i++;
		}
	}

}

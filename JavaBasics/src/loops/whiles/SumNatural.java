package loops.whiles;

import java.util.Scanner;

public class SumNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		while (i <= n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);

	}

}

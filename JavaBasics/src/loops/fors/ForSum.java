package loops.fors;

import java.util.Scanner;

public class ForSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for(i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}

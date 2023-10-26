package loops.fors;

import java.util.Scanner;

public class EvenFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for (i = 0; i <= n; i+=2) {
			System.out.println(i);
//			i++;
		}
	}

}

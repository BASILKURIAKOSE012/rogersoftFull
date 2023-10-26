package basics;

import java.util.Scanner;

public class SumScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		a = sc.nextInt();
		System.out.println("enter second number");
		b = sc.nextInt();
		sum = a + b;
		System.out.println("Sum is " + sum);
		
	}

}

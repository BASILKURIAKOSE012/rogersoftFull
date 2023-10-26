package basics;

import java.util.Scanner;

public class AverageScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z, average;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		x = sc.nextInt();
		System.out.println("Enter second number");
		y = sc.nextInt();
		System.out.println("enter third number");
		z = sc.nextInt();
		average = (x + y + z) / 3;
		System.out.println("Average is " + average);
	
	}

}

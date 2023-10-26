package basics;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		x = sc.nextInt();
		System.out.println("enter the second number");
		y = sc.nextInt();
		if(x>y) {
			System.out.println("greates number is " + x);
		}
		else {
			System.out.println("greatest number is "+ y);
		}

	}

}

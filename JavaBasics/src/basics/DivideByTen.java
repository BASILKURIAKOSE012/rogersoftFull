package basics;

import java.util.Scanner;

public class DivideByTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x%10==0) {
			System.out.println(x+ " is divisible by 10");
		}
		else {
			System.out.println(x+ " is not divisible by 10");
		}
	}

}

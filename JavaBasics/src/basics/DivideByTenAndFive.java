package basics;

import java.util.Scanner;

public class DivideByTenAndFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x%10 == 0 || x%5==0) {
			System.out.println(x+ " number is divisible by 10 and 5");
		}
		else {
			System.out.println(x+ " number is not divisible by 5 and 10");
		}
	}

}

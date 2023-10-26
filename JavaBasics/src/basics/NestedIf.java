package basics;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		x = sc.nextInt();
		if(x%2==0) {
			if(x%3==0) {
				System.out.println("number is divisible by both 2 and 3");
			}else {
				System.out.println("number is divisible by 2 not by 3");
			}
		}
		else {
			if(x%3==0) {
				System.out.println("number is not divisible by 2 but divisible by 3");
			}
			else {
				System.out.println("number is not divisible by 2 and 3");
			}
		}
	}

}

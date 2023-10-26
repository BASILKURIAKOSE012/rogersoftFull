package basics;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not eligible for vote");
		}
	float a = 35/0;
	System.out.println(a);
	}

}

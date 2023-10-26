package basics;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		x = sc.nextInt();
		
		for(int i =10;i>=1;i--) {
			
			System.out.println(x*i);
		}

	}

}

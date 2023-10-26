package arrays;

import java.util.Scanner;

public class EnterMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[5];
		System.out.println("Enter 5 numbers");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			marks[i]= sc.nextInt();
		}
		for(int j=0;j<5;j++) {
			System.out.print(marks[j]+" ");
		}
		
	}

}

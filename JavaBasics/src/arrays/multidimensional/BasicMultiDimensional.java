package arrays.multidimensional;

import java.util.Scanner;

public class BasicMultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] marks = new int[6][5];
		Scanner sc  = new Scanner(System.in); 
		System.out.println("Enter the numbers");
		for(int i =0;i<6;i++)
		{
			for(int j =0;j<5;j++)
			{
				marks[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i<6;i++) {
			for(int j =0;j<5;j++)
			{
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
	}

}

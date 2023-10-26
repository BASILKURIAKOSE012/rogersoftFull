package arrays.multidimensional;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] marks = new int[3][3];
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				marks[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++)
			{
				if(i==j) {
				System.out.print(marks[i][j] + " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

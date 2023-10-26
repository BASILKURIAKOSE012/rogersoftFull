package basics;

import java.util.Scanner;

public class StudentDetail {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int rollNumber;
	String name;
	float mark1;
	float mark2;
	float mark3;
	float total;
	float average;
	float percentage;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter student roll number");
	rollNumber = sc.nextInt();
	sc.nextLine(); 
	System.out.println("Enter student name");
	name= sc.nextLine();
	System.out.println("enter mark1");
	mark1= sc.nextFloat();
	System.out.println("enter mark2");
	mark2 = sc.nextFloat();
	System.out.println("enter mark3");
	mark3 = sc.nextFloat();
	total = mark1+mark2+mark3;
	System.out.println("Sum of marks is " + total);
	average = total/3;
	System.out.println("Average marks is "+ average);
	percentage = (total/150)*100;
	System.out.println("percentage is " + percentage+"%");
	}
}

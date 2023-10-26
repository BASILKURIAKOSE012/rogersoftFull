package oops;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total mark");
		mark = sc.nextInt();
		Student s1 = new Student();
		s1.setData();
		s1.getData();
		s1.getPercentage();
		Student s2 = new Student(mark);
		s2.setData();
		s2.getData();
		s2.getPercentage();
	}

}

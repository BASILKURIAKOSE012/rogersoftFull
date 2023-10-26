package oops;

import java.util.Scanner;

public class Student {
	int rollNo;
	int mark;
	String name;
	int total;

	public Student(int total) {
		this.total = total;
	}

	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll number");
		rollNo = sc.nextInt();
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter mark");
		mark = sc.nextInt();
	}

	public void getData() {
		System.out.println("your name is " + name);
		System.out.println("your roll number is " + rollNo);
		System.out.println("your mark is " + mark);
	}

	public void getPercentage() {
		System.out.println("your percentage is " + (mark * 100) / total + "%");
	}

	public Student() {
		total = 100;
	}

}

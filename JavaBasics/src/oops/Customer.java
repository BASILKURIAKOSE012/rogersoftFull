package oops;

import java.util.Scanner;

public class Customer {
	String customerName;
	int accountnumber;
	int accountBalance;
	
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer name");
		customerName = sc.next();
		System.out.println("enter account number");
		accountnumber = sc.nextInt();
		System.out.println("enter account balance");
		accountBalance = sc.nextInt();
	}
	public void getData() {
		System.out.println("costomer name is "+customerName);
		System.out.println("customer account number is " +accountnumber);
		System.out.println("account balance is rupees " + accountBalance +" only");
	}
	
}

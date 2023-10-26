package bank;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long accountNumber;
		String name;
		double depositAmount;
		double withdrawalAmount;
		double balanceAmount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number");
		accountNumber = sc.nextLong();
		System.out.println("Enter customer name");
		name = sc.next();
		System.out.println("Enter deposit amount");
		depositAmount = sc.nextDouble();
		System.out.println("Enter withdrawal amount ");
		withdrawalAmount = sc.nextDouble();
		balanceAmount = depositAmount - withdrawalAmount ;
		System.out.println(name +" "+ accountNumber +" Your balance amount is rupees  "+ balanceAmount);
		sc.close();
	}

}

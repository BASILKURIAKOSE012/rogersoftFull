package basics;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
Scanner sc = new Scanner(System.in) ;
System.out.println("enter a number");
x = sc.nextInt();
if(x%2==0 || x%3 == 0) {
	System.out.println("number is divisible either by 2 or 3");
}
else {
	System.out.println("number is not divisible by 2 and 3");
}
	}

}

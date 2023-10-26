package basics;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char vowel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter");
		vowel = sc.next().charAt(0);
		switch (vowel) {
		case 'a','A':
			System.out.println("it is a vowel");
			break;
		case 'e','E':
			System.out.println("it is a vowel");
			break;
		case 'i','I':
			System.out.println("it is a vowel");
			break;
		case 'o','O':
			System.out.println("it is a vowel");
			break;
		case 'u','U':
			System.out.println("it is a vowel");
			break;
			default : System.out.println("it is a consonant");
		}

	}

}

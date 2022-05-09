package conditional_statements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char c=sc.next().charAt(0);
		char l=Character.toLowerCase(c);
		switch(l) {
		case 'a':System.out.println(l+" is a vowel");
		case 'e':System.out.println(l+" is a vowel");
		case 'i':System.out.println(l+" is a vowel");
		case 'o':System.out.println(l+" is a vowel");
		case 'u':System.out.println(l+" is a vowel");
		default: System.out.println(l+" is not a vowel");
		}

	}

}

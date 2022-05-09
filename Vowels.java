package conditional_statements;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter character");
		 char d=sc.next().charAt(0);
		 char c=Character.toLowerCase(d);
		 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			 System.out.println(c+" is a vowel");
		 }
		 else if(c>='a'&&c<='z')
			 System.out.println(c+" is a consonent");
		 else
			 System.out.println(c+" is not an alphabet");
       
	}

}

package conditional_statements;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.next();
		char []a=s.toCharArray();
		int vowel=0,consonent=0;
		for(int i=0;i<s.length();i++) {
		switch(a[i]) {
		case 'a':vowel++;break;
		case 'e':vowel++;break;
		case 'i':vowel++;break;
		case 'o':vowel++;break;
		case 'u':vowel++;break;
		default: consonent++;
		 } 
		}
		System.out.println("vowel     "+vowel);
		System.out.println("consonent "+consonent);
	} 
}

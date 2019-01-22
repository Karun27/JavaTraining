package JavaPractice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the palindrome string");
		String b = sn.nextLine();
		for(int i=b.length()-1;i>=0;i--) {
			String c="";
			c=c+b.charAt(i);
			
			System.out.print(c);
		}		
	}
}

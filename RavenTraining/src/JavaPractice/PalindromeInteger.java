package JavaPractice;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String args[]) {
Scanner sn = new Scanner(System.in);
System.out.println("Enter the number you want checck whether the number is palindrome or not");
int a = sn.nextInt();
int b=0;
int c;
int d;
d=a;
while(a!=0) {

	c=a%10;
	b=b*10+c;
	a/=10;
}
if(d==b) {
	System.out.println(d+" is a palindrome");
}else {
	System.out.println(d+" isn't a palindrome");
}

	}
}

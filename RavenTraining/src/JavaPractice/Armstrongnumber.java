package JavaPractice;

import java.util.Scanner;

public class Armstrongnumber {
public static void main(String args[]) {
	
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter the number you want to check it is armstrong or not");
	int a =sn.nextInt();
	int b=0;
	int c;
	int d=a;
	while(a!=0) {
		c=a%10;
		b+=(int) Math.pow(c, 3);
		a/=10;	
	}
	if(d==b) {
		System.out.println(d+" is an armstrong number");
	}else {
		System.out.println(d+" isn't an armstrong number");
	}
}
}

package JavaPractice;

import java.util.Scanner;

public class GCD {
	public static void main(String args[]) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sn.nextInt();
		System.out.println("Enter the 2nd number");
		int b =sn.nextInt();
		int c=0;
		if(b==0) {
			System.out.println("The GCD of two numbers is "+a);
		}
		else {
		while(b>0) {
			if(b<a) {
				c=b;
				b=a%b;
			}
			else{
				c=b;
				b=b%a;
			}
			a=c;
	}
		
		System.out.println("The GCD of two numbers is "+a);
		}

}
}
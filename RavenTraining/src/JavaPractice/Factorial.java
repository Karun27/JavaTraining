package JavaPractice;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
Scanner sn = new Scanner(System.in);
System.out.println("Enter the number to find the factorial");
int n = sn.nextInt();
int a=1,b=1;
for(int i=n;i>0;i--) {
	b*=a*i;
	
	
}
System.out.println(b);
	}

}

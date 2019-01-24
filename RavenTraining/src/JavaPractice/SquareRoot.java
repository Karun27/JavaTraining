package JavaPractice;

import java.util.Scanner;

public class SquareRoot {
public static void main(String args[]) {
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter the number you want to find out the square root");
	double sqrt,i=sn.nextDouble();
	if(i!=0) {
		sqrt=Math.pow(i, 0.5);
		System.out.println("The square root of "+i+" is "+sqrt);
	}else {
		System.out.println("Enter a valid number");
	}
	

}
}

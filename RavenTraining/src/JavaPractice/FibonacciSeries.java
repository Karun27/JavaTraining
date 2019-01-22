package JavaPractice;

public class FibonacciSeries {
	public static void main(String args[]) {
		

		int a=0;
		int b=1;
	   int i=100;
	for(int n=0;n<=i;n++) {
		System.out.print(a+" + ");
		int sum = a+b;
		a=b;
		b=sum;

	}
	}

}

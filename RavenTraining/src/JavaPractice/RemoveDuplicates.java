package JavaPractice;

import java.util.Arrays;

public class RemoveDuplicates {
public static void main(String args[]) {
	int a[]= {91,2,3,91,4};
	for(int r=0;r<a.length;r++) {
		System.out.print(a[r]+"\t");
	}
	System.out.println();
	System.out.println("-----------");
	int s=a.length;
	for(int i=0;i<s;i++) {
		for(int j=i+1;j<s;j++) {
			if(a[i]==a[j]) {
				a[j]=a[s-1];
				s--;
				j--;
				
			}
		}
	}
	int b[]=Arrays.copyOf(a, s);
	
	for(int y=0;y<b.length;y++) {
		
	System.out.print(b[y]+"\t");
	}

}
}

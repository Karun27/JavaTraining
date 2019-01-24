package JavaPractice;

public class ReversingAnArray {
public static void main(String args[]) {
int a[]= {12,54,36,85,69,74,25,20,33};
int s=a.length;
int c;
for(int i=0;i<s/2;i++) {
	c=a[i];
	a[i]=a[(s-1)-i];
	a[(s-1)-i]=c;
}
for(int y=0;y<a.length;y++) {
	System.out.print(a[y]+"\t");
}
}
}

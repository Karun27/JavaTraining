package JavaPractice;

import java.util.Scanner;

public class ReverseStringWords {
	public static void main(String args[]) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sn.nextLine();
		if(a.contains(" ")) {
			for(int i=a.length()-1;i>=0;i--) {
				String c="";
				c=c+a.charAt(i);
				
				System.out.print(c);
			}	
		}else {
			for(int i=a.length()-1;i>=0;i--) {
				String c="";
				c=c+a.charAt(i);
				
				System.out.print(c);
			}	
			
		}
		
	}

}

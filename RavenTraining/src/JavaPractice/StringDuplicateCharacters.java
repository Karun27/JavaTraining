package JavaPractice;

import java.util.Scanner;

public class StringDuplicateCharacters {
	public static void main(String args[]) {

Scanner sn = new Scanner(System.in);
System.out.println("Enter the string");
String a = sn.nextLine();
//System.out.println(a.contentEquals(a));
	for(int i=0;i<a.length();i++) {
		for(int j=i+1;j<a.length();j++) {
			if(a.charAt(i)==a.charAt(j)) {
				System.out.print(a.charAt(i)+"\t");
			}
				
			
		}
	}
	
	}
	
	

}

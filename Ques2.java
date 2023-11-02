package neebalgurukul.day11;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s=sc.nextLine();
		int count=0;
		try {
			int n=s.length();
			for(int i=0;i<=n;i++) {
				if((s.charAt(i)=='a') || (s.charAt(i)=='A') || (s.charAt(i)=='e') || (s.charAt(i)=='E') ||
					(s.charAt(i)=='i') || (s.charAt(i)=='I') ||	(s.charAt(i)=='o') || (s.charAt(i)=='O') ||
					(s.charAt(i)=='u') || (s.charAt(i)=='U')) {
					count++;
				}
			}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Caught an exception: "+e);
		}
		System.out.println("The no. of vowels in the string is: "+count);
	}

}

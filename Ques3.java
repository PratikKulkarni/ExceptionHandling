package neebalgurukul.day11;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="25.0";
		int x=Integer.parseInt(s);
		System.out.println(x);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter two integers");
		String s1,s2;
		//s1=sc.nextLine();
		//s2=sc.nextLine();
		int num1=0,num2,sum,flag=0;
		while(true) {
			try {
				if(flag==0) {
					num1=Integer.parseInt(sc.nextLine());
				}
				flag=1;
				num2=Integer.parseInt(sc.nextLine());
				
				sum=num1+num2;
				break;
			}catch(NumberFormatException e) {
				if(flag==1) {
					System.out.println("2nd input invalid. Please enter the 2nd integer again");
				}
				else
				System.out.println("Invalid input. Please enter 2 integers");
			}
		}
		System.out.println("The sum of the two integers is "+sum);
	}

}

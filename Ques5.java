package neebalgurukul.day11;

import java.util.Scanner;
import java.util.Arrays;

class CustomException extends Exception{
	private int n;
	CustomException(int n){
		this.n=n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
}

public class Ques5 {
	
	

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		int num,flag=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter 5 integers");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
			try {
				for(int i=0;i<4;i++) {
					if(a[i]==a[i+1]) {
						flag=1;
						throw new CustomException(a[i]);
					}
				}
				
			
			System.out.println("No duplicate numbers!");
		}catch(CustomException e) {
			System.out.println("Error: Duplicate number found: "+e.getN());
		}
	}
}


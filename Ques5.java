package neebalgurukul.day11;

import java.util.Scanner;

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
		int[] a=new int[100001];
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 10 integers ranging from 1 to 100000");
	
			int i=0;
			try {
				while(i<10) {
					num=sc.nextInt();
					if(a[num]==1) {
						throw new CustomException(num);
					}
					else {
						a[num]=1;
						i++;
					}
				}
			
			System.out.println("No duplicate numbers!");
		}catch(CustomException e) {
			System.out.println("Error: Duplicate number found: "+e.getN());
		}
	}
}


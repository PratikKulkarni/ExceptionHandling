package neebalgurukul.day11;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) throws NoMatchException {
		// TODO Auto-generated method stub
		int[] a =new int[1000];
		for(int i=0;i<100;i++) {
			a[i]=(int)((Math.random() * (1000 - 1)) + 1);
		}
		int ind;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Please enter an index from 0 to 99");
			ind=sc.nextInt();
			if((ind<0) || (ind>99)) {
				throw new ArrayIndexOutOfBoundsException();
			}
			System.out.println("The array element at index "+ind+" is "+a[ind]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you entered is out of bounds.");
		}
	}

}

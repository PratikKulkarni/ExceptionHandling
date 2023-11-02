package neebalgurukul.day11;

import java.util.Scanner;

class NoMatchException extends Exception{
	private String description;
	NoMatchException(String desc){
		this.description=desc;
	}
	
	public String toString() {
		return "Custom Exception: "+description;
	}
}

public class TestCustomException {

	public static void main(String[] args) throws NoMatchException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s=sc.nextLine();
		/*System.out.println("Please enter a description for the custom exception");
		String desc=sc.nextLine();*/
		try {
			if(!s.equals("India")) {
				throw new NoMatchException("String entered not India");
			}
			System.out.println("No exception thrown");
		}catch(NoMatchException nme) {
				System.out.println(nme);
				
			}
		System.out.println("Exiting main method");
		
	}

}

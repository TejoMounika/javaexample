package practice;

import java.util.Scanner;

public class ReadingInputs {

	public static void main(String[] args) {
	
		Scanner obj= new Scanner(System.in);
	
		System.out.println("Enter first value");
		int a= obj.nextShort();
		
		System.out.println("Enter 2 value");
		int b= obj.nextShort();
		
		int c=a+b;
		
		System.out.println("output:" +c);
		
				

	}

}

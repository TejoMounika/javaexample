package javaExample;

import java.util.Scanner;

public class SinDimInArr {

	public static void main(String[] args) {
		// Declare the array
		int[] a=new int[5];
		
		
		// Scanner object
		Scanner obj=new Scanner(System.in);
		
		
		// store the array values
		for(int i=0;i<5;i=i+1)
		{
			System.out.println("a["+i+"] = ");
			a[i]=obj.nextInt();
		}
		
		
		
		
		// Display the array values
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}

	}

}

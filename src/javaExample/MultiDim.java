package javaExample;

import java.util.Scanner;

public class MultiDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// double dimensional
				int[][] a=new int[2][3];
				
				
				// Scanner object
				Scanner MD=new Scanner(System.in);
				
				
				// store the array values.
				for(int r=0;r<2;r++)
				{
					
					for(int c=0;c<3;c++)
					{
						
						System.out.println("a["+r+"]["+c+"] = ");
						a[r][c]=MD.nextInt();
					}
					
				}
				
				
				// display the array values
				
				for(int r=0;r<2;r++)
				{
					
					for(int c=0;c<3;c++)
					{
						
						System.out.print(a[r][c] +" ");
					}
					
					System.out.println("");
	}

}
}
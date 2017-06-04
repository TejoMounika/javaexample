package javaExample;

public class RetuFun {

		// TODO Auto-generated method stub
		public static int[] Calculator(int x,int y)
		{
			
			int a=x+y;
			int b=x-y;
			int c=x*y;
			int d=x/y;
			int e=x%y;
			
			int[] z={a,b,c,d,e};
			
			
			return z;
			
		}

		public static void main(String[] args) 
		{
			
			int[] r=Calculator(52,60);
			
			System.out.println("Addition value : "+r[0]);
			System.out.println("Subtraction value : "+r[1]);
			System.out.println("Multiplication value : "+r[2]);
			System.out.println("Division value : "+r[3]);
			System.out.println("Remainder value : "+r[4]);
			

		}

	}



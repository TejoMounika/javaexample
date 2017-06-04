package javaExample;

public class RetFun {


	public static int[] Calculator(int[] x)
	{
		// TODO Auto-generated method stub
		int a=x[0]+x[1];
		int b=x[0]-x[1];
		int c=x[0]*x[1];
		int d=x[0]/x[1];
		int e=x[0]%x[1];
		
		int[] z={a,b,c,d,e};
		
		
		return z;
		
	}

	public static void main(String[] args) 
	{
		int[] values={10,15};
		
		int[] r=Calculator(values);
		
		System.out.println("Addition value : "+r[0]);
		System.out.println("Subtraction value : "+r[1]);
		System.out.println("Multiplication value : "+r[2]);
		System.out.println("Division value : "+r[3]);
		System.out.println("Remainder value : "+r[4]);
		

	}
	}



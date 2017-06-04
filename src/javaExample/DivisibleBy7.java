package javaExample;

public class DivisibleBy7 {

	public static void main(String[] args) {
	
		int n=0;
		for(int i=1; i<=100; i++)
		{
			if(i%7==0)
			{
				n++;
			}
		
			System.out.println(n);
		}

	}

}

package javaExample;

public class Minimum {
	 int n1;
	 int n2;
	
	public int minFunction(int n1, int n2) {
		   int min;
		   if (n1 > n2)
		      min = n2;
		   else
		      min = n1;

		   return min; 
		}

	public static void main(String[] args){
		
  Minimum m=new Minimum();
   int min = m.minFunction(5, 4 );
   System.out.println(min);
	}
}

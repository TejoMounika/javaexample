package tryCatch;

public class WithTryCatch {

	public static void main(String[] args) {
		 int num1, num2;
	     try { 
	        // Try block to handle code that may cause exception
	        num1 = 2;
	        num2 = 62 / num1;
	        System.out.println("Output :"+ num2);
	     } catch (ArithmeticException e) { 
	            // This block is to catch divide-by-zero error
	            System.out.println("Error: Don't divide a number by zero");
	       }
	     System.out.println("I'm out of try-catch block in Java.");
	   

	}

}

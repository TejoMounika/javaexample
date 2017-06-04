package practice;

public class Inheritance {

	
		//Declare static variables
		static int a =10, b =20;
		// Declare non-static variables
		int c= 30, d=20;
		//Creating static method with returning a value
		public static int add(){
			int result= a+b;
			return result;
					}
		//static method with out returning any value
		public static void multiply(){
			System.out.println(a*b);
		}
		//non-static method with returning a value
        public int add2(){
	    int re=c+d;
	    return re;
	     }
       //non static with out returning a value
       public void mul(){
	   System.out.println(c*d);
       }

public static void main(String[] args) {
	
	//Access static class members
	int x=Inheritance.add();
	System.out.println(x);
	

}
}
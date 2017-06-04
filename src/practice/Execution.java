package practice;

public class Execution {

	public static void main(String[] args) {
		
		NoArgNoRet NN= new NoArgNoRet();
		
		NN.multiply();
		
		ArgNoRet AN= new ArgNoRet();
		
		AN.multiply(20, 10);
		
		NoArgRet NR= new NoArgRet();
		
		int m=NR.multiply();
		System.out.println(m);
		
		ArgRet AR= new ArgRet();
		
		int v=AR.multiply(40, 5);
		System.out.println(v);
		
		
	}

}

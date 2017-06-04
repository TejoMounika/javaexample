package polymorphism;

public class RuntimeMethodOverriding2 extends RuntimeMethodOverriding {
	public void myMethod(){
		System.out.println(12);
	}
	public static void main(String[] args) {
		RuntimeMethodOverriding2 RO= new RuntimeMethodOverriding2();
		RO.myMethod();
		
		RuntimeMethodOverriding RO2= new RuntimeMethodOverriding();
		RO2.myMethod();
	}

}

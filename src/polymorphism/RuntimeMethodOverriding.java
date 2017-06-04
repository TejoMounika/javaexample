package polymorphism;

public class RuntimeMethodOverriding {
public void myMethod(){
	System.out.println(7);
}
	public static void main(String[] args) {
		RuntimeMethodOverriding RO= new RuntimeMethodOverriding();
		RO.myMethod();
	}

}

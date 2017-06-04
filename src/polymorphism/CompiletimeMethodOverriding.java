package polymorphism;

public class CompiletimeMethodOverriding {
public void add(int a, int b){
	System.out.println(a+b);
}

public void add(double a, double b){
	System.out.println(a+b);
}

public void add(int a, int b, int c){
	System.out.println(a+b+c);
}

	public static void main(String[] args) {
	
		CompiletimeMethodOverriding MO= new CompiletimeMethodOverriding();
		MO.add(10, 20);
		MO.add(10, 20, 30);
		MO.add(1.12, 5.44);
	}

}

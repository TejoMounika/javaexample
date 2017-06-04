package javaExample;

public class Constructors {
	String first;
	String last;

           //	Passing parameters
	public Constructors(String first, String last)
	{

	this.first=first;
	this.last=last;
	}
	

  
public static void main(String[] args){
	Constructors c= new Constructors("name", "joy");
	
	Constructors c1= new Constructors("na", "jo");
	System.out.println(c.first+ " "+c.last+"");
	System.out.println(c1.first+ " "+c1.last+"");	
}
}
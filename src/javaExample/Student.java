package javaExample;

public class Student {
	String name;
	int ID;
	int grade;
	public Student(String t_name, int t_ID, int t_grade){
		name=t_name;
		ID=t_ID;
		grade=t_grade;
	}
	public static void main(String[] args)
	{
	
	// creating a object(new is keyword)
	
	
		Student s=new Student("ram",3,1);
		Student s1= new Student("mona",7,1);
		System.out.println(s.name +" " +s.ID +" " +s.grade);
		System.out.println(s1.name +" " +s1.ID +" " +s1.grade);
		
	
	}
}

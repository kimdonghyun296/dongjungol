package q613;

public class Student {
	private String name;
	private String school;
	private int grade;
	
	public Student(String name,String school,int grade)
	{
		this.name=name;
		this.school=school;
		this.grade=grade;
	}
	
	public void print()
	{
		System.out.println("name="+name);
		System.out.println("school="+school);
		System.out.println("grade="+grade);
	}

}

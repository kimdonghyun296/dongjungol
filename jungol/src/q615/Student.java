package q615;

public class Student {
	
	public String name;
	public int num1;
	public int num2;
	
	
	Student(String a,int b,int c)
	{
		this.name=a;
		this.num1=b;
		this.num2=c;
	}
	
	void print()
	{
		System.out.println(name+" "+num1+" "+num2);
	}

}

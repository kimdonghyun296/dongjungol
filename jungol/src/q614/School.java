package q614;

public class School {
	
	private String schname;
	private int grade;
	



	public String getSchname() {
		return schname;
	}

	public void setSchname(String schname) {
		this.schname = schname;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void print()
	{
		System.out.println(grade+" grade in "+schname+" school.");
	}
}

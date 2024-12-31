package q614;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		String schoolname=sc.next();
		int grade=sc.nextInt();
		
		School str1=new School();
		School str2=new School();
		
		str1.setSchname("Jejuelementary");
		str1.setGrade(6);
		
		str2.setSchname(schoolname);
		str2.setGrade(grade);
		
		str1.print();
		str2.print();
	}

}

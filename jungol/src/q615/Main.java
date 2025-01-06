package q615;
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		Student[] st=new Student[N];
		
		for(int i=0;i<N;i++)
		{
			st[i]=new Student(sc.next(),sc.nextInt(),sc.nextInt());
		}
		
		sc.close();
		
		for(int i=0;i<N;i++)
		{
			st[i].print();
		}

		int avg1=(st[0].num1+st[1].num1)/N;
		int avg2=(st[0].num2+st[1].num2)/N;
		
		
		
		System.out.println("avg "+avg1+" "+avg2);
	}
}
	
	
	
	
	




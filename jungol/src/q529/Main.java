package q529;

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int height=sc.nextInt();
		int weight=sc.nextInt();
		sc.close();
		
		int result=weight+100-height;
		
		System.out.println(result);
		
		if(result>0)
		{
			System.out.println("Obesity");
		}
		
	}
}

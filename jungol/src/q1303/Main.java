package q1303;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		
		int increasement=0;
		
		for(int i=1;i<num1+1;i++)
		{
			for(int j=1;j<=num2;j++)
			{
				System.out.printf("%d ", j+increasement);
			}
			System.out.println();
			increasement+=num2;	
		}
	}
}

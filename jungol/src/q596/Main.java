package q596;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.next();
		int num1=sc.nextInt();
		sc.close();
		int num2=str1.length();

		if(num1<=num2)
		{
			for(int i=num2-1;i>=num2-num1;i--)
			{
					System.out.print(str1.charAt(i));
				
			}
		}
		else
		{
			for(int i=num2-1;i>=0;i--)
			{
					System.out.print(str1.charAt(i));
				
			}
		}
	
	}
}



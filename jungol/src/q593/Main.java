package q593;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("ASCII code =? ");
			
			int num1=sc.nextInt();
			
			if(num1<=127 && num1>=33)
			{
				System.out.printf("%c\n",num1);
			}
			
			else
			{
				sc.close();
				break;
			}
		}
		
	}
	
}


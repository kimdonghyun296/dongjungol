package q558;

import java.util.*;
public class Main {
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		int[] abc=new int[100];
		int count=0;
		for(;;)
		{
			abc[count]=sc.nextInt();
			if(abc[count]==0)
			{
				sc.close();
				break;
			}
			count++;
			
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(abc[i]+" ");
		}
	}
}

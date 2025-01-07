package q599;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		int num1=str.length();
		
		for(int i=0;num1>i;i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=122)
			{
				System.out.print(str.toUpperCase().charAt(i));
			}
		}


	}

}

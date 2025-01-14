package q111;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] ary=new int[4];
		int sum=0;
		
		for(int i=0;i<4;i++)
		{
			ary[i]=sc.nextInt();
			sum+=ary[i];
		}
		sc.close();
		System.out.printf("sum %d\n",sum);
		System.out.printf("avg %d\n",sum/4);
	}
}

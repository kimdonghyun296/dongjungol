package q1291;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
			if((num1<=1||num1>9)||(num2<=1||num2>9)) {
				System.out.println("INPUT ERROR!");
			}
			else {
				if(num1>num2)
				{
					for(int i=1;i<=9;i++)
					{
						for(int j=num1;j>=num2;j--)
						{
							System.out.printf("%d * %d = %2d   ",j,i,j*i);
						}
						System.out.println();
					}
				}
				else if(num1<num2)
				{
					for(int i=1;i<=9;i++)
					{
						for(int j=num1;j<=num2;j++)
						{
							System.out.printf("%d * %d = %2d   ",j,i,j*i);
						}
						System.out.println();
					}
				}
				else {
					for(int i=1;i<=9;i++)
					{
							System.out.printf("%d * %d = %2d\n",num1,i,num1*i);
					}
				}
				break;
			}
		}			
	}	
}
		



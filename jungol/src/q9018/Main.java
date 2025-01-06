package q9018;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("두 개의 수를 입력하시오. ");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		Calculate cal=new Calculate(num1,num2);
		
		System.out.println(num1+" + "+num2+" = "+cal.result1);
		System.out.println(num1+" - "+num2+" = "+cal.result2);
		System.out.println(num1+" * "+num2+" = "+cal.result3);
		System.out.println(num1+" / "+num2+" = "+cal.result4);
		System.out.println(num1+" % "+num2+" = "+cal.result5);
	}

}

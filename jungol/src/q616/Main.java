package q616;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		calculate cal=new calculate();
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int num5=sc.nextInt();
		int num6=sc.nextInt();
		sc.close();
		
	
		cal.getnum(num1,num2,num3,num4,num5,num6);
	
		System.out.printf("(%.1f, %.1f)", cal.xre(),cal.yre());
		
		

	}

}

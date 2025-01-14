package q530;

import java.util.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		sc.close();
		
		if(num1>=20)
		{
			System.out.println("adult");
		}
		else {
			System.out.println((20-num1)+" years later");
		}

	}

}

package q528;

import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
	        
	        int inputNum = sc.nextInt();
	        sc.close();
	        
	        
	        System.out.println(inputNum);
	        if(inputNum<0)
	        {
	        	System.out.println("minus");
	        }
		}
}

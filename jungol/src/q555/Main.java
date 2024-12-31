package q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] sa = new char[10];
		for(int i=0;i<sa.length;i++) {
			sa[i] = sc.next().charAt(0);
			System.out.print(sa[i]);
		}
	}
}
package itp1.itp1_3_d;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 0;
		for (int i=a;i<=b;i++) {
			if (c%i==0) {
				cnt++;
			}
			
		}
		System.out.println(cnt);

	}

}

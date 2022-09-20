package itp1.itp1_2_b;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

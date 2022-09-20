package itp1.itp1_2_d;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if (x - r >= 0 && x + r <= w && y - r >= 0 && y + r <= h) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

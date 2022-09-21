package itp1.itp1_3_b;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static String fmt = "Case %d: %d";

	public static void main(String[] args) {
		int cnt = 1;
		while (true) {
			int ni = sc.nextInt();
			if (ni == 0) {
				break;
			}
			System.out.println(String.format(fmt, cnt, ni));
			cnt++;
		}

	}

}

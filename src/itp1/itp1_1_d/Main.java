package itp1.itp1_1_d;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i = sc.nextInt();
		int h = i / 3600;
		int m = (i - h * 3600) / 60;
		int s = i - h * 3600 - m * 60;
		System.out.println(h + ":" + m + ":" + s);

	}

}

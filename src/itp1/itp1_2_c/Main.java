package itp1.itp1_2_c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[3];
		Arrays.setAll(arr, i -> sc.nextInt());
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

	}

}

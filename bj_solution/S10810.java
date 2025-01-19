package bj_solution;

import java.util.Scanner;

public class S10810 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int rp = sc.nextInt();
		
		int[] basket = new int[count];

		for (int i = 0; i < rp; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int ball = sc.nextInt();
			for (int j = start - 1; j <= end - 1; j++) {
				basket[j] = ball;
			}
		}
		
		for (int i = 0; i < count; i++) {
			System.out.print(basket[i] + " ");
		}
		
		sc.close();

	}
}

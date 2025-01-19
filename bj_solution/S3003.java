package bj_solution;

import java.util.Scanner;

public class S3003 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] chessA = { 1, 1, 2, 2, 2, 8 };
		int[] chessB = new int[6];

		for (int i = 0; i < 6; i++) {
			chessB[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < 6; i++) {
			System.out.print((chessA[i] - chessB[i]) + " ");
		}

	}
}

package bj_solution;

import java.util.Scanner;

public class S2738 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[n][m];

		// a 입력받기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// b 입력받기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// a + b 출력하기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print((a[i][j] + b[i][j]) + " ");
			}
			System.out.print("\n");
		}
		
	}
}

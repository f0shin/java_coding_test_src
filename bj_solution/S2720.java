package bj_solution;

import java.util.Scanner;

public class S2720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rp = sc.nextInt();
		int[][] change = new int[rp][4];
		
		final int Q = 25; // 쿼터 0.25
		final int D = 10; // 다임 0.10
		final int N = 5; // 니켈 0.05
		final int P = 1; // 페니 0.01
		
		for (int r = 0; r < rp; r++)  {
			
			int price = sc.nextInt();
		
			change[r][0] = price / Q;
			price = price % Q;
			
			change[r][1] = price / D;
			price = price % D;
			
			change[r][2] = price / N;
			price = price % N;
			
			change[r][3] = price / P;
			price = price % P;

		}
		
		for (int i = 0; i < rp; i++) {
			System.out.println(change[i][0] + " " + change[i][1] + " " + change[i][2] + " " + change[i][3]);
		}

		sc.close();
		
	}
}

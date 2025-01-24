package bj_solution;

import java.util.Scanner;

public class S2563 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int rp = sc.nextInt();
		
		boolean[][] square = new boolean[100][100];

		// 정사각형 입력 받기
		for (int r = 0; r < rp; r++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					square[x + i][y + j] = true;
				}
			}
		}
		sc.close();
				
		int count = 0;
		
		// 집계
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (square[i][j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);

	}
}

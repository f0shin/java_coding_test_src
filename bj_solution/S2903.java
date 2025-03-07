package bj_solution;

import java.util.Scanner;

public class S2903 {
	
	public static void main(String[] args) {
		
		// 중앙 이동 알고리즘
		Scanner sc = new Scanner(System.in);
		int rp = sc.nextInt();
		sc.close();
		
		int dotCount = 4;
		int squareCount = 1;
		int addDotCount = 0;
		
		for (int i = 0; i < rp; i++) {
			
			addDotCount = dotCount * 2 + 1;
			dotCount = dotCount + addDotCount;
			squareCount = squareCount + dotCount;

		}
		
		System.out.println(dotCount);
		
	}

}

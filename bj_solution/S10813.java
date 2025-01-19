package bj_solution;

import java.util.Scanner;

public class S10813 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int basketCnt = sc.nextInt();
		int changeCnt = sc.nextInt();
		
		int[] baskets = new int[basketCnt];
		
		// 1) 바구니 초기화
		for (int i = 0; i < basketCnt; i++) {
			baskets[i] = i + 1;
		}
		
		// 2) 바구니 안에 공 바꾸기
		for (int i = 0; i < changeCnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int temp = baskets[a - 1];
			baskets[a - 1] = baskets[b - 1];
			baskets[b - 1] = temp;
		}
		
		// 3) 최종 결과
		for (int i = 0; i < basketCnt; i++) {
			System.out.print(baskets[i] + " ");
		}
		
		sc.close();

	}
}

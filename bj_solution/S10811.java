package bj_solution;

import java.util.Scanner;
import java.util.Stack;

public class S10811 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int basketCnt = sc.nextInt();
		int changeCnt = sc.nextInt();

		int[] baskets = new int[basketCnt];

		// 1) 바구니 초기화
		for (int i = 0; i < basketCnt; i++) {
			baskets[i] = i + 1;
		}

		// 2) 바구니 위치 바꾸기
		for (int i = 0; i < changeCnt; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			Stack<Integer> stk = new Stack<>();
			
			for (int j = a; j <= b; j++) {
				stk.push(baskets[j]);
			}
			for (int j = a; j <= b; j++) {
				baskets[j] = stk.pop();
			}
		}
		
		sc.close();

		// 3) 결과 출력
		for (int i = 0; i < basketCnt; i++) {
			System.out.print(baskets[i] + " ");
		}

	}
}

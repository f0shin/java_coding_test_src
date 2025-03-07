package bj_solution;

import java.util.Scanner;

public class S1427 {
	// 소트인사이드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine(); // 입력값: 0 ~ 1,000,000,000
		sc.close();
		
		int[] cnt = new int[10]; // 10진수: 0 ~ 9
		
		for (int i = 0; i < num.length(); i++) {
			int index = Integer.parseInt(num.split("")[i]);
			cnt[index]++;
		}
		
		for (int i = 9; i >= 0; i--) { // 내림차순: 9 ~ 0
			if (cnt[i] > 0) {
				String temp = String.valueOf(i);
				System.out.print(temp.repeat(cnt[i]));
			}
		}

	}
}

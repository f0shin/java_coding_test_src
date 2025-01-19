package programmers_basic.day4;

import java.util.Scanner;

public class Solution018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int answer = 0;
		
		// 내 답안
		if (n % 2 == 0) { // 짝수 --> n 이하의 짝수들의 제곱의 합
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0) {
					answer += (i * i);
				}
			}
		} else { // 홀수 --> n 이하의 홀수들의 합
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 1) {
					answer += i;
				}
			}
		}
		
		// 다른 답안
//		for (int i = n; i >=0; i -= 2) {
//			answer += (n % 2 == 0) ? i * i : i;
//		}

		System.out.println(answer);

		sc.close();
	}
}
// <홀짝에 따라 다른 값 반환하기>
// 입력받은 n이 홀수이면 n 이하의 홀수들의 합을, 짝수이면 n 이하의 짝수들의 제곱의 합을 출력하기
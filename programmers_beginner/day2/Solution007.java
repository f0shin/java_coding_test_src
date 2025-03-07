package programmers_beginner.day2;

public class Solution007 {

	public static void main(String[] args) {
		
		int a = 8; // 분자1
		int b = 2; // 분모1
		int c = 8; // 분자2
		int d = 2; // 분모2
		
		int[] result = solution(a, b, c, d);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

		// 1) 분수1 정리
		if (numer1 % denom1 == 0) {
			numer1 = numer1 / denom1;
			denom1 = denom1 / denom1;
		}
		
		// 2) 분수2 정리
		if (numer2 % denom2 == 0) {
			numer2 = numer2 / denom2;
			denom2 = denom2 / denom2;
		}
		
		// 3) 분수의 덧셈
		int totDenom = 0; // 분모
		int totNumer = 0; // 분자
		
		if (denom1 > denom2) {
			if (denom1 % denom2 == 0) {
				totDenom = denom1;
				totNumer = numer1 + (numer2 * (denom1 / denom2));
			} else {
				totDenom = denom1 * denom2;
				totNumer = (denom2 * numer1) + (denom1 * numer2);
			}
		} else {
			if (denom2 % denom1 == 0) {
				totDenom = denom2;
				totNumer = numer2 + (numer1 * (denom2 / denom1));
			} else {
				totDenom = denom1 * denom2;
				totNumer = (denom2 * numer1) + (denom1 * numer2);
			}
		}

		int[] answer = { totNumer, totDenom };

		return answer;

	}

}
// 분수의 덧셈 - 미제출

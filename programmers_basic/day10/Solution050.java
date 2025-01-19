package programmers_basic.day10;

public class Solution050 {
	public static void main(String[] args) {

		int a = 3;
		int b = 1;
		String c = "qjnwezgrpirldywt";

		System.out.println(solution(a, b, c));

		int d = 1;
		int e = 0;
		String f = "programmers";

		System.out.println(solution(d, e, f));

	}

	public static String solution(int q, int r, String code) {

		String answer = "";

		for (int i = 0; i < code.length(); i++) {
			if (i % q == r) {
				answer += code.charAt(i);
			}
		}
		return answer;
	}
}

// <qr code>
// code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열 반환
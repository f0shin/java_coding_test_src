package programmers_basic.day11;

public class Solution051 {
	public static void main(String[] args) {

		String a = "Programmers";

		int[] result = solution(a);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(String my_string) {
		
		int[] answer = new int[52];
		for (int i = 0; i < 52; i++) {
			answer[i] = 0;
		}

		// A~Z: 65~90 --> 0~25 (-65)
		// a~z: 97~122 --> 26~51 (-71)

		for (char c : my_string.toCharArray()) {
			if (65 <= c && c <= 90) {
				answer[c - 65]++;
			} else if (97 <= c && c <= 122) {
				answer[c - 71]++;
			}
		}
		
		return answer;
		
	}
}
// <문자 개수 세기>
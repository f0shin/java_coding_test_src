package programmers_basic.day16;

public class Solution079 {
	public static void main(String[] args) {

		String myString = "PrOgRaMmErS";

		System.out.println(solution2(myString));

	}

	// 나의 첫 답안..
	public static String solution(String myString) {

		String answer = "";
		String temp = myString.toLowerCase();

		for (char c : temp.toCharArray()) {
			if (c == 'a') {
				answer += String.valueOf(c).toUpperCase();
			} else {
				answer += c;
			}
		}

		return answer;

	}

	// 다른 사람들 답안 보고 활용한 답안 --> replace 활용
	public static String solution2(String myString) {

		String answer = myString.toLowerCase().replace("a", "A");

		return answer;

	}
}
// <A 강조하기>
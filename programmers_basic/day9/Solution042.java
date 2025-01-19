package programmers_basic.day9;

public class Solution042 {
	public static void main(String[] args) {

		String[] a = { "progressive", "hamburger", "hammer", "ahocorasick" };
		int[][] b = { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } };

		System.out.println(solution(a, b));

	}

	public static String solution(String[] my_strings, int[][] parts) {

		String answer = "";

		for (int i = 0; i < parts.length; i++) {
			answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
		}

		return answer;

	}

}

// <부분 문자열 이어 붙여 문자열 만들기>
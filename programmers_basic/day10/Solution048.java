package programmers_basic.day10;

public class Solution048 {
	public static void main(String[] args) {

		String a = "Progra21Sremm3";
		int b = 6;
		int c = 12;

		System.out.println(solution(a, b, c));

		String d = "Stanley1yelnatS";
		int e = 4;
		int f = 10;

		System.out.println(solution(d, e, f));

	}

	public static String solution(String my_string, int s, int e) {

		String answer = "";

		String temp = my_string.substring(s, e + 1);
		int j = temp.length() - 1;

		for (int i = 0; i < my_string.length(); i++) {
			if (s <= i && i <= e) {
				answer += temp.charAt(j);
				j--;
			} else {
				answer += my_string.charAt(i);
			}
		}

		return answer;

	}

}

// <문자열 뒤집기>

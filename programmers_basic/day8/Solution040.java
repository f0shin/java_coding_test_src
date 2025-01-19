package programmers_basic.day8;

import java.util.Stack;

public class Solution040 {
	public static void main(String[] args) {

		String a = "rermgorpsam";
		int[][] b = { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } };
		String result = solution(a, b);

		System.out.print(result);

	}

	public static String solution(String my_string, int[][] queries) {

		String answer = "";

		char[] my = new char[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			my[i] = my_string.charAt(i);
		}

		Stack<Character> temp = new Stack<>();

		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];

			for (int j = s; j <= e; j++) {
				temp.push(my[j]);
			}

			while (s <= e) {
				my[s] = temp.pop();
				s++;
			}
		}

		for (int i = 0; i < my.length; i++) {
			answer += my[i];
		}

		return answer;
	}

}

// <문자열 여러 번 뒤집기>

package programmers_basic.day7;

import java.util.ArrayList;

public class Solution032 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 555;
		int[] result = solution(a, b);
		
		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int l, int r) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int k = 0;

		for (int i = l; i <= r; i++) {
			String s = String.valueOf(i);
			int cnt = 0;

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '0' || s.charAt(j) == '5')
					cnt++;
			}

			if (cnt == s.length()) {
				list.add(k, i);
				k++;
			}
		}

		if (list.size() == 0) {
			int[] answer = { -1 };

			return answer;

		} else {
			int[] answer = new int[list.size()];

			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
			return answer;
		}
	}
}

// <배열 만들기 2>
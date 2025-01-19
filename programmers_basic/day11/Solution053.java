package programmers_basic.day11;

import java.util.ArrayList;

public class Solution053 {
	public static void main(String[] args) {

		String a = "apporoograpemmemprs";
		int[] b = { 1, 16, 6, 15, 0, 10, 11, 3 };

		System.out.println(solution(a, b));

	}

	public static String solution(String my_string, int[] indices) {

		ArrayList<Integer> temp = new ArrayList<>();
		for (int idx : indices) {
			temp.add(idx);
		}

		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if (!temp.contains(i)) {
				answer += my_string.charAt(i);
			}
		}

		return answer;
	}
}
// <글자 지우기>
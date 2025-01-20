package programmers_basic.day23;

public class Solution112 {
	public static void main(String[] args) {

		String[] a = { "abc", "def", "ghi" };
		String b = "ef";

		System.out.println(solution(a, b));

	}

	public static String solution(String[] str_list, String ex) {

		String answer = "";

		for (int i = 0; i < str_list.length; i++) {
			if (!str_list[i].contains(ex)) {
				answer += str_list[i];
			}
		}

		return answer;

	}
}
// <꼬리 문자열>
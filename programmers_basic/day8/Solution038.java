package programmers_basic.day8;

public class Solution038 {
	public static void main(String[] args) {
		
		String a = "cvsgiorszzzmrpaqpe";
		int[] b = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		String result = solution(a, b);

		System.out.print(result);
		
	}

	public static String solution(String my_string, int[] index_list) {
		String answer = "";

		for (int i = 0; i < index_list.length; i++) {
			answer += my_string.charAt(index_list[i]);
		}

		return answer;
	}

}

// <글자 이어 붙여 문자열 만들기>
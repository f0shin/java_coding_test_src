package programmers_basic.day22;

public class Solution106 {
	public static void main(String[] args) {

		String n_str = "000889000";

		System.out.println(solution(n_str));

	}

	public static String solution(String n_str) {
		
		String answer = "";
		
		for (int i = 0; i < n_str.length(); i++) {
			if (n_str.toCharArray()[i] != '0') {
				answer = String.copyValueOf(n_str.toCharArray(), i, n_str.length() - i);
				break;
			}
		}

		return answer;
//		return String.valueOf(Integer.parseInt(n_str)); // 오오!!

	}
}
// <0 떼기>
package programmers_basic.day17;

public class Solution081 {
	public static void main(String[] args) {

		String myString = "AbCdEFG";
		String pat = "dE";

		System.out.println(solution2(myString, pat));

	}

	// 나의 첫 답안
	public static String solution(String myString, String pat) {

		String answer = "";

		for (int i = myString.length(); i >= 0; i--) {
			if (myString.substring(0, i).endsWith(pat)) {
				answer = myString.substring(0, i);
				break;
			}
		}

		return answer;

	}

	// lastIndexOf() 활용!
	public static String solution2(String myString, String pat) {

		String answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length());

		return answer;

	}
}
// <특정 문자열로 끝나는 가장 긴 부분 문자열 찾기>
package programmers_basic.day15;

public class Solution075 {
	public static void main(String[] args) {

		String myString = "AbCdEfG";
		String pat = "aBc";

		System.out.println(solution2(myString, pat));

	}
	
	// 나의 답안
	public static int solution(String myString, String pat) {

		int answer = 0;
		
		int myLen = myString.length();
		int pLen = pat.length();

		if (myLen < pLen) {
			return answer;
		}

		String my = myString.toLowerCase();
		String p = pat.toLowerCase();

		for (int i = 0; i <= myLen - pLen; i++) {
			String mySub = my.substring(i, i + pLen);
			if (mySub.equals(p)) {
				answer = 1;
				break;
			}
		}

		return answer;

	}
	
	// contains 활용 답안!!
	public static int solution2(String myString, String pat) {

		int answer = 0;

		String myLow = myString.toLowerCase();
		String pLow = pat.toLowerCase();

		if (myLow.contains(pLow)) {
			answer = 1;
		}

		return answer;

	}
	
}
// <원하는 문자열 찾기>
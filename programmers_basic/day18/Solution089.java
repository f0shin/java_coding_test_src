package programmers_basic.day18;

public class Solution089 {
	public static void main(String[] args) {

		String myString = "ABBAA";
		String pat = "AABB";
		
		System.out.print(solution(myString, pat));

	}

	public static int solution(String myString, String pat) {

		int answer = 0;

		String temp1 = myString.replace("A", "C");
		String temp2 = temp1.replace("B", "A");
		String temp = temp2.replace("C", "B");

		if (temp.contains(pat)) {
			answer = 1;
		}

		return answer;
		
	}
}
// <문자열 바꿔서 찾기>
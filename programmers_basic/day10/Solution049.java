package programmers_basic.day10;

public class Solution049 {
	public static void main(String[] args) {

		String a = "ihrhbakrfpndopljhygc";
		int b = 4;
		int c = 2;

		System.out.println(solution(a, b, c));

		String d = "programmers";
		int e = 1;
		int f = 1;

		System.out.println(solution(d, e, f));

	}

	public static String solution(String my_string, int m, int c) {

		String answer = "";

		// 1) 나의 풀이..
		int raw = my_string.length() / m;
		String[] tempArr = new String[raw];
		String tempStr = "";
		int r = 0;

		for (int i = 0; i < my_string.length(); i++) {
			tempStr += my_string.charAt(i);

			if ((i + 1) % m == 0) {
				tempArr[r] = tempStr;
				tempStr = "";
				r++;
			}
		}

		for (int i = 0; i < raw; i++) {
			answer += tempArr[i].charAt(c - 1);
		}

		// 2) 다른 풀이 --> 왜케 짧은 거야..!
//		for (int i = c - 1; i < my_string.length(); i += m) {
//            answer += my_string.charAt(i);
//        }

		return answer;
	}
}

// <세로 읽기>
// my_string을 m 글자씩 끊어서 쓸 때 왼쪽부터 c 번째 글자들 조합한 문자열 반환하기

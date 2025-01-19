package programmers_basic.day8;

public class Solution036 {
	public static void main(String[] args) {

		boolean[] a = {true, false, false, false};
		boolean result = solution(a[0], a[1], a[2], a[3]);

		System.out.print(result);

	}

	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

		boolean answer = (x1 || x2) && (x3 || x4);

		return answer;
	}

}

// <간단한 논리 연산>
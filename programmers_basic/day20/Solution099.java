package programmers_basic.day20;

public class Solution099 {
	public static void main(String[] args) {

		int[] arr = { 49, 12, 100, 276, 33 };
		int n = 27;

		int[] result = solution(arr, n);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] arr, int n) {

		int[] answer = new int[arr.length];
		int d = 0;

		if (arr.length % 2 == 0) {
			d = 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == d) {
				answer[i] = arr[i] + n;
			} else {
				answer[i] = arr[i];
			}
		}

		return answer;

	}
}
// <배열의 길이에 따라 다른 연산하기>
package programmers_basic.day24;

public class Solution118 {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 100, 99, 98 };
		int b = 3;

		int[] result = solution(a, b);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	public static int[] solution(int[] arr, int k) {
		
		int[] answer = new int[arr.length];

		if (k % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				answer[i] = arr[i] * k;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				answer[i] = arr[i] + k;
			}
		}

		return answer;
		
	}
}
// <조건에 맞게 수열 변환하기 3>
package programmers_basic.day7;

public class Solution031 {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 4, 3 };
		int[][] b = { { 0, 4, 1 }, { 0, 3, 2 }, { 0, 3, 3 } };
		int[] result = solution(a, b);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] arr, int[][] queries) {

		int[] answer = new int[arr.length];

		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (queries[i][0] <= j && j <= queries[i][1] && j % queries[i][2] == 0) {
					arr[j]++;
				}
			}
		}

		for (int k = 0; k < arr.length; k++) {
			answer[k] = arr[k];
		}

		return answer;
	}

}

// <수열과 구간 쿼리 4>
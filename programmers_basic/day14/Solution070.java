package programmers_basic.day14;

import java.util.Arrays;

public class Solution070 {
	public static void main(String[] args) {

		int[] numbers = { 0, 1, 2, 3, 4 };
		int[][] queries = { { 0, 1 }, { 1, 2 }, { 2, 3 } };

		int[] result = solution(numbers, queries);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] arr, int[][] queries) {

		for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				arr[j]++;
			}
		}

		int[] answer = Arrays.copyOf(arr, arr.length);

		return answer;

	}
}
// <수열과 구간 쿼리 1>
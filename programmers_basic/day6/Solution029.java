package programmers_basic.day6;

public class Solution029 {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
		
		int[] result = solution(arr, queries);
		
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
		int temp = 0;

		for (int i = 0; i < queries.length; i++) {
			temp = arr[queries[i][0]];
			arr[queries[i][0]] = arr[queries[i][1]];
			arr[queries[i][1]] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}

		return answer;
	}
}

// <수열과 구간 쿼리3>
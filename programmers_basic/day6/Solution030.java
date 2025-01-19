package programmers_basic.day6;

public class Solution030 {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
		
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
        int[] answer = new int[queries.length];
        
        for (int n = 0; n < queries.length; n++) {
            int temp = 0;
            for (int i = queries[n][0]; i <= queries[n][1]; i++) {
                if (queries[n][2] < arr[i]) {
                    if (temp == 0) { 
                        temp = arr[i];
                    } else {
                        temp = temp > arr[i] ? arr[i] : temp;
                    }
                }
            }
            if (temp == 0) temp = -1;
            answer[n] = temp;
        }

		return answer;
	}
}

// <수열과 구간 쿼리2>
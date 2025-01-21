package programmers_basic.day24;

public class Solution120 {
	public static void main(String[] args) {

		int a = 3;

		int[][] result = solution(a);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
		}

	}

	public static int[][] solution(int n) {
		
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
        
    }
}
// <특별한 이차원 배열 1>
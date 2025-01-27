package programmers_basic.day25;

public class Solution124 {
	public static void main(String[] args) {

		int a[][] = { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		int b = 2;
		
		System.out.println(solution(a, b));

	}

	public static int solution(int[][] board, int k) {
		
		int answer = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if ((i + j) <= k) {
					answer += board[i][j];
				}
			}
		}

		return answer;

	}
}
// <이차원 배열 대각선 순회하기>
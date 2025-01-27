package programmers_basic.day25;

public class Solution122 {
	public static void main(String[] args) {

		int a[][] = { { 5, 192, 33 }, { 192, 72, 95 }, { 33, 95, 999 } };

		System.out.println(solution(a));

	}

	public static int solution(int[][] arr) {

		int answer = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == arr[j][i]) {
					answer = 1;
				} else {
					answer = 0;
					return answer;
				}
			}
		}

		return answer;

	}
}
// <특별한 이차원 배열 2>
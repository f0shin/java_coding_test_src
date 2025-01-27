package programmers_basic.day25;

public class Solution121 {
	public static void main(String[] args) {

		int a = 5;

		int[][] result = solution(a);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static int[][] solution(int n) {

		int[][] answer = new int[n][n];

		int num = 1;
		int i = 0;
		int j = 0;
		int type = 0; // 0-right, 1-down, 2-left, 3-up
		int rp = n; // 4
		int r = rp; // 4

		while (num <= n * n) { // 1 ~ 16

			answer[i][j] = num;

			num++;
			r--;

			if (type == 0) { // right : i 고정, j 증가
				j++;
				if (r == 0) {
					rp--;
					r = rp;
					type = 1; // right --> down
					j--;
					i++;
				}
			} else if (type == 1) { // down : j 고정, i 증가
				i++;
				if (r == 0) {
					r = rp;
					type = 2; // down --> left
					i--;
					j--;
				}
			} else if (type == 2) { // left : i 고정, j 감소
				j--;
				if (r == 0) {
					rp--;
					r = rp;
					type = 3; // left --> up
					j++;
					i--;
				}
			} else if (type == 3) { // up : j 고정, i 감소
				i--;
				if (r == 0) {
					r = rp;
					type = 0; // up --> right
					i++;
					j++;
				}
			}

		}

		return answer;

	}
}
// <정수를 나선형으로 배치하기>
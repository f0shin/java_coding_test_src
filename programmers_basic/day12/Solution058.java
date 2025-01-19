package programmers_basic.day12;

import java.util.ArrayList;

public class Solution058 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] itv = { { 1, 3 }, { 0, 4 } };

		int[] result = solution(arr, itv);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
	}

	public static int[] solution(int[] arr, int[][] itv) {

		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < itv.length; i++) {
			for (int j = itv[i][0]; j <= itv[i][1]; j++) {
				temp.add(arr[j]);
			}
		}

		int[] answer = new int[temp.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}

		return answer;

	}
}
// <배열 만들기 3>

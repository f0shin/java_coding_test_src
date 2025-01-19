package programmers_basic.day12;

import java.util.ArrayList;

public class Solution060 {
	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[] query = { 4, 1, 2 };

		int[] result = solution(arr, query);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] arr, int[] query) {

		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			temp.add(arr[i]);
		}
		
		int rp = 0;

		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {
				rp = (temp.size() - 1) - query[i];
				for (int j = 0; j < rp; j++) {
					temp.remove(temp.size() - 1);
				}
			} else {
				rp = query[i];
				for (int j = 0; j < rp; j++) {
					temp.remove(0);
				}
			}
		}

		int[] answer = new int[temp.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}

		return answer;

	}
}
// <배열 조각하기>
// ArrayList의 사이즈가 가변인 걸 까먹었다!
package programmers_basic.day12;

import java.util.ArrayList;

public class Solution059 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 2, 1, 10, 2, 1 };

		int[] result = solution(arr);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] arr) {

		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				temp.add(i);
			}
		}

		if (temp.size() == 0) {
			int[] answerFail = { -1 };
			return answerFail;
		}

		int start = temp.get(0);
		int end = temp.get(temp.size() - 1);
		temp.clear();

		for (int i = start; i <= end; i++) {
			temp.add(arr[i]);
		}

		int[] answer = new int[temp.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}

		return answer;
		
	}
}
// <2의 영역>

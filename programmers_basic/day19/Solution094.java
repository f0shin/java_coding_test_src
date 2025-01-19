package programmers_basic.day19;

import java.util.ArrayList;

public class Solution094 {
	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 1, 0 };

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
			if (temp.isEmpty()) {
				temp.add(arr[i]);
			} else {
				if (temp.get(temp.size() - 1) == arr[i]) {
					temp.remove(temp.size() - 1);
				} else {
					temp.add(arr[i]);
				}
			}
		}
		
		if (temp.isEmpty()) {
			return new int[] { -1 };
		}
		
		int[] answer = new int[temp.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}
		return answer;

	}
}
// <배열 만들기 6>
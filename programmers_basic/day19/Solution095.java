package programmers_basic.day19;

import java.util.ArrayList;

public class Solution095 {
	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1 };
		int k = 3;

		int[] result = solution(arr, k);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] arr, int k) {

		ArrayList<Integer> temp = new ArrayList<>();
		int[] answer = new int[k];
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (!temp.contains(arr[i])) {
				temp.add(arr[i]);
				cnt++;
				if (cnt == k) break;
			}
		}
		
		for (int i = 0; i < temp.size(); i++) {
			answer[i] = temp.get(i);
		}
		
		if (temp.size() < k) {
			for (int i = temp.size(); i < k; i++) {
				answer[i] = -1;
			}
		}

		return answer;

	}
}
// <무작위로 K개의 수 뽑기>
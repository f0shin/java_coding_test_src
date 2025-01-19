package programmers_basic.day19;

import java.util.ArrayList;

public class Solution092 {
	public static void main(String[] args) {

		int[] arr = { 5, 1, 4 };

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
            for (int j = 0; j < arr[i]; j++) {
                temp.add(arr[i]);
            }
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
// <배열의 원소만큼 추가하기>
package programmers_basic.day20;

import java.util.Arrays;

public class Solution100 {
	public static void main(String[] args) {

		int[] num_list = { 12, 4, 15, 46, 38, 1, 14 };

		int[] result = solution(num_list);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] num_list) {

		Arrays.sort(num_list);
		
		int[] answer = new int[5];
		
		for (int i = 0; i < 5; i++) {
			answer[i] = num_list[i];
		}
		
		return answer;
		
	}
}
// <뒤에서 5등까지>
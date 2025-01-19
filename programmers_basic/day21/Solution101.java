package programmers_basic.day21;

import java.util.Arrays;

public class Solution101 {
	public static void main(String[] args) {

		int[] num_list = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };

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
		
		int[] answer = new int[num_list.length - 5];
		int j = 0;
		
		for (int i = 5; i < num_list.length; i++) {
			answer[j] = num_list[i];
			j++;
		}
		
		return answer;
		
	}
}
// <뒤에서 5등 위로>
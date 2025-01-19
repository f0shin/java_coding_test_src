package programmers_basic.day13;

import java.util.Arrays;

public class Solution064 {
	public static void main(String[] args) {
		
		int[] num_list = { 5, 2, 1, 7, 5 };
		int n = 3;

		int[] result = solution(num_list, n);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
		
	}
	
	// 나의 답안
	public static int[] solution(int[] num_list, int n) {

        return Arrays.copyOfRange(num_list, 0, n);

    }
	
}
// <n 번째 원소까지>
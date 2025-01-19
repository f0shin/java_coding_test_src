package programmers_basic.day13;

import java.util.ArrayList;

public class Solution062 {
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

	public static int[] solution(int[] num_list, int n) {

		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = n; i < num_list.length; i++) { // n ~ len-1 --> 3 ~ 4
			temp.add(num_list[i]);
		}
		
		for (int i = 0; i < n; i++) { // 0 ~ n-1 --> 0 ~ 2
			temp.add(num_list[i]);
		}
		
		int[] answer = new int[num_list.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}
		
		return answer;
		
	}
}
// <순서 바꾸기>
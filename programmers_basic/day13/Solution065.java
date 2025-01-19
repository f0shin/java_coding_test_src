package programmers_basic.day13;

import java.util.ArrayList;

public class Solution065 {
	public static void main(String[] args) {
		
		int[] num_list = { 4, 2, 6, 1, 7, 6 };
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

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            temp.add(num_list[i]);
        }

        int[] answer = new int[temp.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
// <n 번째 원소까지>
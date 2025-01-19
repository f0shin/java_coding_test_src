package programmers_basic.day19;

import java.util.ArrayList;

public class Solution093 {
	public static void main(String[] args) {

		int[] arr = { 3, 2, 4, 1, 3 };
		boolean[] flag = { true, false, true, false, false };
		
		int[] result = solution(arr, flag);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
		
	}

	public static int[] solution(int[] arr, boolean[] flag) {
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		for (int i = 0; i < flag.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					temp.add(arr[i]);
				}
			} else {
				for (int j = 0; j < arr[i]; j++) {
					temp.remove(temp.size() - 1);
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
// <빈 배열에 추가, 삭제하기>
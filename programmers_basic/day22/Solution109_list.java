package programmers_basic.day22;

import java.util.ArrayList;

public class Solution109_list {
	public static void main(String[] args) {

		int[] arr = { 293, 1000, 395, 678, 94 };
		int[] delete_list = { 94, 777, 104, 1000, 1, 12 };
		
		int[] result = solution(arr, delete_list);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] arr, int[] delete_list) {

		ArrayList<Integer> temp = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			temp.add(arr[i]);
		}
		
		for (int i = 0; i < delete_list.length; i++) {
//			temp.remove(delete_list[i]); // 에러: 인덱스로 인식함.
			temp.remove((Integer)delete_list[i]);
		}
		
		int[] answer = new int[temp.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}
		
		return answer;
		
	}
}
// <배열의 원소 삭제하기>
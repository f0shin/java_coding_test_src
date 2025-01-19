package programmers_basic.day11;

public class Solution055 {
	public static void main(String[] args) {

		int[] a1 = { 0, 0, 0, 1 };
		int b1 = 1;

		System.out.println(solution(a1, b1));
		
		int[] a2 = { 1, 0, 0, 1, 0, 0 };
		int b2 = 4;
		
		System.out.println(solution(a2, b2));
		
		int[] a3 = { 1, 1, 1, 1, 0 };
		int b3 = 3;
		
		System.out.println(solution(a3, b3));

	}

	public static int solution(int[] arr, int idx) {
		
		// 나의 답안
//		int answer = arr.length;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (i >= idx && arr[i] == 1) {
//				answer = answer > i ? i : answer;
//			}
//		}
//        
//        if (answer == arr.length) {
//            answer = -1;
//        }
//
//		return answer;
		
		// 다른 사람의 굉장한 답안..!!
		int answer = -1;
		
		for (int i = idx; i < arr.length; i++) {
			if(arr[i] == 1) {
				return i;
			}
		}
		
		return answer;
		
	}
}
// <가까운 1 찾기>
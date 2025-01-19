package programmers_basic.day20;

import java.util.Arrays;

public class Solution096 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
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

		int len = arr.length;
		
		// 2의 거듭제곱이면 바로 return
		if ((len & (len - 1)) == 0) {
			return arr;
		}

		int num = len;
		int count = 0;
		
		// len에서 가장 가까운 2의 거듭제곱 구하기
		while (num > 1) {
			num = num / 2; // 6/2=3, 3/2=1
			count++;
		}
		count++;
		int newLen = (int) Math.pow(2, count);
		
		// 옮겨담기 + 늘려준 곳은 0으로 채우기
		int[] answer = Arrays.copyOf(arr, newLen);
//		int[] answer = new int[newLen];
//		for (int i = 0; i < newLen; i++) {
//			if (i < len) {
//				answer[i] = arr[i];
//			} else {
//				answer[i] = 0;
//			}
//		}

		return answer;

	}
}
// <배열의 길이를 2의 거듭제곱으로 만들기>

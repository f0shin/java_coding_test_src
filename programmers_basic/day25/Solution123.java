package programmers_basic.day25;

public class Solution123 {
	public static void main(String[] args) {

		int a[][] = { {57, 192, 534, 2}, {9, 345, 192, 999} };

		int[][] result = solution(a);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {				
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static int[][] solution(int[][] arr) {
		
		int rowLen = arr.length;
		int colLen = arr[0].length;
		int len = rowLen >= colLen ? rowLen : colLen;
		int[][] answer = new int[len][len];

//		for (int i = 0; i < len; i++) {
//			for (int j = 0; j < len; j++) {
//				int temp = 0;
//				if (i >= rowLen || j >= colLen) {
//					temp = 0;
//				} else {
//					temp = arr[i][j];
//				}
//				answer[i][j] = temp;
//			}
//		}
		
		for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, len);
        }

		return answer;
		
	}
}
// <정사각형 만들기>
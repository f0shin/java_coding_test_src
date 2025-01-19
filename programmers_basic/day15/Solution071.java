package programmers_basic.day15;

public class Solution071 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 100, 99, 98 };
		
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

        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;

    }
}
// <조건에 맞게 수열 변환하기1>
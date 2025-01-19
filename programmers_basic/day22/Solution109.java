package programmers_basic.day22;

public class Solution109 {
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

		int count = 0;
		
		for (int i = 0; i < delete_list.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == delete_list[i]) {
					arr[j] = 0;
					count++;
				}
			}
		}

		int[] answer = new int[arr.length - count];
		int a = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				answer[a] = arr[i];
				a++;
			}
		}

		return answer;
		
	}
}
// <배열의 원소 삭제하기>
package programmers_basic.day7;

public class Solution033 {
	public static void main(String[] args) {

		int a = 3;
		int b = 10;
		int[] result = solution(a, b);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int start_num, int end_num) {

		int len = end_num - start_num + 1;
		int[] answer = new int[len];

		for (int i = 0; i < len; i++) {
			answer[i] = start_num + i;

		}

		return answer;
	}

}

// <카운트 업>
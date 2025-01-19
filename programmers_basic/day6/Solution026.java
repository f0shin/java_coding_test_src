package programmers_basic.day6;

public class Solution026 {
	public static void main(String[] args) {
		
		int[] num_list = {5, 2, 1, 7, 5};
		int[] result = solution(num_list);
		
		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] num_list) {

		int n = num_list.length; // 3
		int[] answer = new int[n + 1]; // 4 (0~3)

		// 1) 배열 복사 (num_list --> answer)
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
		}

		// 2) answer 마지막 원소 추가
		answer[answer.length - 1] = num_list[n - 1] > num_list[n - 2] 
				? num_list[n - 1] - num_list[n - 2]
				: num_list[n - 1] * 2;

		return answer;
	}

}

// <마지막 두 원소>

package programmers_basic.day14;

public class Solution066 {
	public static void main(String[] args) {

		int[] num_list = { -1, 2, 5, 6, 3 };

		System.out.print(solution(num_list));
		
	}

	public static int solution(int[] num_list) {
		
		int answer = 0;

		// 1 ~ num_list.length 번 원소일 때
		// 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값 return
		int tempOdd = 0; // 홀수
		int tempEven = 0; // 짝수
		for (int i = 0; i < num_list.length; i++) {
			if ((i + 1) % 2 == 0) {
				tempEven += num_list[i];
			} else {
				tempOdd += num_list[i];
			}
		}

		answer = tempOdd >= tempEven ? tempOdd : tempEven;

		return answer;
		
	}
}
// <홀수 vs 짝수>
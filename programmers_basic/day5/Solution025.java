package programmers_basic.day5;

public class Solution025 {
	public static void main(String[] args) {
		
		int[] num_list = { 3, 4, 5, 2, 1 };

		System.out.println(solution(num_list));
	}

	public static int solution(int[] num_list) {
		int answer = 0;
		String even = "";
		String odd = "";

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) { // 짝수
				even += String.valueOf(num_list[i]);
			} else { // 홀수
				odd += String.valueOf(num_list[i]);
			}
		}

		answer = Integer.parseInt(even) + Integer.parseInt(odd);

		return answer;
	}
}
// <이어 붙인 수>
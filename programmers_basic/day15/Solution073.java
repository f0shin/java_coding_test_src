package programmers_basic.day15;

public class Solution073 {
	public static void main(String[] args) {

		int[] num_list = { 12, 4, 15, 1, 14 };

		System.out.println(solution(num_list));

	}

	public static int solution(int[] num_list) {

		int answer = 0;
		int count = 0;

		for (int i = 0; i < num_list.length; i++) {
			for (count = 0; num_list[i] > 1; count++) {
				if (num_list[i] % 2 == 0) {
					num_list[i] = num_list[i] / 2;
				} else {
					num_list[i] = (num_list[i] - 1) / 2;
				}
			}
			answer += count;
		}

		return answer;

	}
}
// <1로 만들기>
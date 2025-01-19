package programmers_basic.day12;

public class Solution057 {
	public static void main(String[] args) {

		int[] num_list1 = { 12, 4, 15, 46, 38, -2, 15 };
		int[] num_list2 = { 13, 22, 53, 24, 15, 6 };

		System.out.println(solution(num_list1));
		System.out.println(solution(num_list2));

	}

	public static int solution(int[] num_list) {
		int answer = -1;

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				return i;
			}
		}

		return answer;
	}
}
// <첫 번째로 나우는 음수>

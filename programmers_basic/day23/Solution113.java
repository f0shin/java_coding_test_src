package programmers_basic.day23;

public class Solution113 {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b = 3;

		System.out.println(solution(a, b));

	}

	public static int solution(int[] num_list, int n) {

		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] == n) {
				answer = 1;
				break;
			}
		}

		return answer;

	}
}
// <정수 찾기>
package programmers_basic.day14;

public class Solution069 {
	public static void main(String[] args) {

		int[] numbers = { 34, 5, 71, 29, 100, 34 };
		int n = 123;

		System.out.print(solution(numbers, n));

	}

	public static int solution(int[] numbers, int n) {

		int answer = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
			if (answer > n) {
				break;
			}
		}
		
		return answer;

	}
}
// <n보다 커질 때까지 더하기>
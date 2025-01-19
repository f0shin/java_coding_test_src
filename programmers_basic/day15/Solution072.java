package programmers_basic.day15;

public class Solution072 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 100, 99, 98 };
		
		System.out.print(solution(arr));
		
	}

	public static int solution(int[] arr) {

		int answer = 0;
		boolean sign = true;

		while (sign) {
			answer++;
			sign = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] = arr[i] / 2;
					sign = true;
				} else if (arr[i] < 50 && arr[i] % 2 == 1) {
					arr[i] = arr[i] * 2 + 1;
					sign = true;
				}
			}
		}
		answer--;

		return answer;

	}
}
// <조건에 맞게 수열 변환하기2>
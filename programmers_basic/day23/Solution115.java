package programmers_basic.day23;

public class Solution115 {
	public static void main(String[] args) {

		int[] a = { 2021, 12, 28 };
		int[] b = { 2021, 12, 29 };

		System.out.println(solution(a, b));

	}

	public static int solution(int[] date1, int[] date2) {

		int answer = 0;

		if (date1[0] - date2[0] < 0) { // year
			return 1;
		} else if (date1[0] - date2[0] == 0) {
			if (date1[1] - date2[1] < 0) { // month
				return 1;
			} else if (date1[1] - date2[1] == 0) {
				if (date1[2] - date2[2] < 0) { // day
					return 1;
				}
			}
		}

		return answer;

	}
}
// <날짜 비교하기>
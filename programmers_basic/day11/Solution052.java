package programmers_basic.day11;

public class Solution052 {
	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		int[] result = solution(a, b);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int n, int k) {
		
        int[] answer = new int[n / k];
        int i = 0;

        for (int num = k; num <= n; num += k) {
            answer[i] = num;
            i++;
        }

        return answer;
    }
}
// <배열 만들기 1>
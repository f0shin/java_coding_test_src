package programmers_basic.day18;

public class Solution088 {
	public static void main(String[] args) {

		String binomial = "40000 * 40000";

		System.out.print(solution(binomial));

	}

	public static int solution(String binomial) {

		int answer = 0;

		String[] bin = binomial.split(" ");
		int a = Integer.parseInt(bin[0]);
		int b = Integer.parseInt(bin[2]);

		if (bin[1].equals("+")) {
			answer = a + b;
		} else if (bin[1].equals("-")) {
			answer = a - b;
		} else if (bin[1].equals("*")) {
			answer = a * b;
		}

		return answer;

	}
}
// <간단한 식 계산하기>
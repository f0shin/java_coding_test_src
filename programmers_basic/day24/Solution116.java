package programmers_basic.day24;

public class Solution116 {
	public static void main(String[] args) {

		String[] a = { "cafelatte", "americanoice", "hotcafelatte", "anything" };

		System.out.println(solution(a));

	}

	public static int solution(String[] order) {

		int answer = 0;

		for (int i = 0; i < order.length; i++) {
			answer += getPrice(order[i]);
		}

		return answer;

	}

	public static int getPrice(String oder) {

		if (oder.contains("cafelatte")) { // cafelatte, cafelatte(ice), cafelatte(hot)
			return 5000;
		} else { // americano, americano(ice), americano(hot), anything
			return 4500;
		}

	}
}
// <커피 심부름>
package programmers_basic.day24;

public class Solution117 {
	public static void main(String[] args) {

		String[] a = { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...." };
		int b = 2;

		String[] result = solution(a, b);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	public static String[] solution(String[] picture, int k) {

		String[] answer = new String[picture.length * k];
		int aIndex = 0;

		for (int i = 0; i < picture.length; i++) {
			String temp = "";
			for (int j = 0; j < picture[i].length(); j++) {
				temp += picture[i].split("")[j].repeat(k);
			}

			for (int j = 0; j < k; j++) {
				answer[aIndex] = temp;
				aIndex++;
			}
		}

		return answer;

	}
}
// <그림 확대>
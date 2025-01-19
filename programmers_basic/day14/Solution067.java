package programmers_basic.day14;

public class Solution067 {
	public static void main(String[] args) {

		String[] names = { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };
		
		String[] result = solution(names);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static String[] solution(String[] names) {

		int len = names.length / 5;
        if (names.length % 5 > 0) {
            len++;
        }

		String[] answer = new String[len];
		int j = 0;

		for (int i = 0; i < names.length; i += 5) {
			answer[j] = names[i];
			j++;
		}

		return answer;
	}
}
// <5명씩>
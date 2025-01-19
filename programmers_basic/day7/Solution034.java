package programmers_basic.day7;

import java.util.ArrayList;

public class Solution034 {
	public static void main(String[] args) {
		
		int a = 10;
		int[] result = solution(a);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
	}

	public static int[] solution(int n) {

		ArrayList<Integer> coll = new ArrayList<>();
		boolean sign = true;

        while (sign) {
            coll.add(n);

            if (n == 1) sign = false;

            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }

		int[] answer = new int[coll.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = coll.get(i);
		}
		
		return answer;
	}

}

// <콜라츠 수열 만들기>
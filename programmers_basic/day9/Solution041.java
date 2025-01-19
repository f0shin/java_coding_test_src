package programmers_basic.day9;

import java.util.ArrayList;

public class Solution041 {
	public static void main(String[] args) {
		
		String[] a = {"0123456789","9876543210","9999999999999"};
		int b = 50000;
		int c = 5;
		int d = 5;
		int[] result = solution(a, b, c, d);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(String[] intStrs, int k, int s, int l) {
		
		ArrayList<Integer> tempArr = new ArrayList<>();
		int tempInt = 0;
		String tempStr = "";

		for (int i = 0; i < intStrs.length; i++) {
			tempStr = intStrs[i].substring(s, s + l);
			tempInt = Integer.parseInt(tempStr);
			if (tempInt > k) {
				tempArr.add(tempInt);
			}
		}
		int[] answer = new int[tempArr.size()];
		for (int j = 0; j < answer.length; j++) {
			answer[j] = tempArr.get(j);
		}

		return answer;
	}
}

// <배열 만들기 5>
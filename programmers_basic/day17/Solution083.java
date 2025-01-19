package programmers_basic.day17;

import java.util.ArrayList;

public class Solution083 {
	public static void main(String[] args) {

		String[] strArr = { "and","notad","abcd" };

		String[] result = solution(strArr);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static String[] solution(String[] strArr) {

		ArrayList<String> temp = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++) {
			if (!(strArr[i].contains("ad"))) {
				temp.add(strArr[i]);
			}
		}

		String[] answer = new String[temp.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}

		return answer;
		
	}
}
// <ad 제거하기>
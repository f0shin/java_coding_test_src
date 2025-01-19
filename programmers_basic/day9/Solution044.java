package programmers_basic.day9;

import java.util.ArrayList;
import java.util.Collections;

public class Solution044 {
	public static void main(String[] args) {

		String a = "programmers";
		String[] result = solution(a);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static String[] solution(String my_string) {

		// 1) 접미사 모으기
		ArrayList<String> temp = new ArrayList<>();

		for (int i = 0; i < my_string.length(); i++) {
			temp.add(my_string.substring(i));
		}

		// 2) 정렬
		Collections.sort(temp);

		// 3) ArrayList --> 배열 변환
		String[] answer = temp.toArray(new String[temp.size()]);

		return answer;
		
	}

}
// <접미사 배열>
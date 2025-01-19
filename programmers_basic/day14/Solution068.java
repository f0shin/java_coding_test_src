package programmers_basic.day14;

import java.util.ArrayList;

public class Solution068 {
	public static void main(String[] args) {

		String[] todo_list = { "problemsolving", "practiceguitar", "swim", "studygraph" };
		boolean[] finished = { true, false, true, false };

		String[] result = solution(todo_list, finished);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static String[] solution(String[] todo_list, boolean[] finished) {

		ArrayList<String> temp = new ArrayList<>();

		for (int i = 0; i < todo_list.length; i++) {
			if (!finished[i]) {
				temp.add(todo_list[i]);
			}
		}

		String[] answer = new String[temp.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}

		return answer;

	}
}
// <할 일 목록>
package programmers_basic.day21;

import java.util.HashMap;

public class Solution102 {
	public static void main(String[] args) {

		int[] rank = { 3, 7, 2, 5, 4, 6, 1 };
		boolean[] attendance = { false, true, true, true, true, false, false };

		System.out.println(solution(rank, attendance));
		
	}

	public static int solution(int[] rank, boolean[] attendance) {

		int answer = 0;
		
		HashMap<Integer, Integer> temp = new HashMap<>(); // 등수, 학생번호
		for (int i = 0; i < rank.length; i++) {
			temp.put(rank[i], i);
		}
		
		int[] arr = { -1, -1, -1 };
		int r = 1;
		int i = 0;
		
		while (i < 3) {
			// 만약 1등(key)이 참여한다면, 1등의 학생번호(value)를 얻어서 넣기.
			if (attendance[temp.get(r)]) {
				arr[i] = temp.get(r);
				i++;
			}
			r++;			
		}
		
		answer = 10000 * arr[0] + 100 * arr[1] + arr[2];
		
		return answer;

	}
}
// <전국 대회 선발 고사>
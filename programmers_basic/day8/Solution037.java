package programmers_basic.day8;

import java.util.ArrayList;

public class Solution037 {
	public static void main(String[] args) {

		int[] a = { 6, 3, 3, 6 };
		int result = solution(a[0], a[1], a[2], a[3]);

		System.out.print(result);

	}

	public static int solution(int a, int b, int c, int d) {
		int answer = 0; // score
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = 0;
		}

		int e3 = 0;
		int e4 = 0;
		ArrayList<Integer> e1 = new ArrayList<>();
		ArrayList<Integer> e2 = new ArrayList<>();
		int type = 0;

		// 1) 주사위 눈 입력
		arr[a - 1]++;
		arr[b - 1]++;
		arr[c - 1]++;
		arr[d - 1]++;

		// 2) 주사위 눈 집계 및 점수 유형(type) 설정
		for (int i = 0; i < 6; i++) {
			switch (arr[i]) {
			case 1:
				e1.add(i + 1);
				break;
			case 2:
				e2.add(i + 1);
				break;
			case 3:
				e3 = i + 1;
				type = 2;
				break;
			case 4:
				e4 = i + 1;
				type = 1;
				break;
			}
		}

		if (e1.size() == 4) {
			type = 5;
		}
		if (e2.size() == 2) {
			type = 3;
		}
		if (type == 0) {
			type = 4;
		}

		// 3) 점수 계산
		switch (type) {
		case 1:
			answer = 1111 * e4;
			break;
		case 2:
			answer = (int) Math.pow((10 * e3 + e1.get(0)), 2);
			break;
		case 3:
			answer = (e2.get(0) + e2.get(1)) * (int) Math.abs(e2.get(0) - e2.get(1));
			break;
		case 4:
			answer = e1.get(0) * e1.get(1);
			break;
		case 5:
			answer = (int) Math.min(Math.min(e1.get(0), e1.get(1)), Math.min(e1.get(2), e1.get(3)));
			break;
		}

		return answer;
	}
}

// <주사위 게임 3>

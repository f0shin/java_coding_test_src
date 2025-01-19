package bj_solution;

import java.util.Scanner;

public class S2675 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt(); // 테스트 케이스 개수
		String[] answer = new String[count];

		for (int i = 0; i < count; i++) {
			int rp = sc.nextInt(); // 반복 횟수
			String str = sc.next();

			String[] temp = str.split("");
			String tempStr = "";

			for (int j = 0; j < temp.length; j++) {
				tempStr += temp[j].repeat(rp);
			}

			answer[i] = tempStr;
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		sc.close();

	}
}

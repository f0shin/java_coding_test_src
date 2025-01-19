package programmers_basic.day5;

import java.util.Scanner;

public class Solution021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code = sc.next(); 
		

		String answer = "";
		int mode = 0;
		char[] arrCode = code.toCharArray();

		for (int i = 0; i < arrCode.length; i++) {
			switch (mode) {
			case 0:
				if (arrCode[i] == '1') {
					mode = 1;
				} else {
					answer += i % 2 == 0 ? arrCode[i] : "";
				}
				break;

			case 1:
				if (arrCode[i] == '1') {
					mode = 0;
				} else {
					answer += i % 2 == 1 ? arrCode[i] : "";
				}
				break;
			}
		}
		if (answer == "") answer = "EMPTY";

		System.out.println(answer);
		sc.close();
	}

}

// <코드 처리하기>
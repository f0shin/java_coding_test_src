package bj_solution;

import java.util.Scanner;

public class S5622 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int answer = 0;
		
		for (int i = 0; i < str.length(); i++) {
			answer += getDialNumber(str.charAt(i)) + 1;
		}

		System.out.println(answer);

	}

	public static int getDialNumber(char c) {

		switch (c) {
		case 'A': case 'B': case 'C':
			return 2;
		case 'D': case 'E':	case 'F':
			return 3;
		case 'G': case 'H':	case 'I':
			return 4;
		case 'J': case 'K': case 'L':
			return 5;
		case 'M': case 'N': case 'O':
			return 6;
		case 'P': case 'Q': case 'R': case 'S':
			return 7;
		case 'T': case 'U': case 'V':
			return 8;
		case 'W': case 'X': case 'Y': case 'Z':
			return 9;
		default:
			return 0;
		}

	}
}
// java 11에서는 멀티 case가 안된대.. (예: case 'A', 'B', 'C':)
package programmers_basic.day4;

import java.util.Scanner;

public class Solution019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ineq = sc.next(); // "<" or ">"
		String eq = sc.next(); // "=" or "!"
		int n = sc.nextInt();
		int m = sc.nextInt();

		int answer = 0;

		String temp = ineq + eq;

		switch (temp) {
		case ">=":
			answer = n >= m ? 1 : 0;
			break;
		case "<=":
			answer = n <= m ? 1 : 0;
			break;
		case ">!":
			answer = n > m ? 1 : 0;
			break;
		case "<!":
			answer = n < m ? 1 : 0;
			break;
		// default:
		}

		System.out.println(answer);

		sc.close();
	}
}
// <조건 문자열>
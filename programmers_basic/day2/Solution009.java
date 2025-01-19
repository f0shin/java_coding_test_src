package programmers_basic.day2;

import java.util.Scanner;

public class Solution009 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.printf("%d is even\n", n);
		} else {
			System.out.printf("%d is odd\n", n);
		}

		sc.close();
	}
}

// <홀짝 구분하기>
// 자연수 n을 입력 받아서 짝수면 "n is even", 홀수면 "n is odd" 출력하기
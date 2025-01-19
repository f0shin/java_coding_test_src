package programmers_basic.day2;

import java.util.Scanner;

public class Solution006 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, (a + b));
		
		sc.close();

	}
}

// <덧셈식 출력하기>
// 입력 받은 두 개의 정수 a, b를 "a + b = c"의 형태로 출력하기

// printf 활용

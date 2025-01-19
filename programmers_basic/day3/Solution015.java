package programmers_basic.day3;

import java.util.Scanner;

public class Solution015 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
		int d = 2 * a * b;
		
		int answer = c >= d ? c : d;
		
		System.out.println(answer);
		sc.close();	
	}
}

// <두 수의 연산값 비교하기>
// 입력받은 두 정수 a, b를 연산⊕(이어붙이기)하여,
// a ⊕ b와 2 * a * b 중 더 큰 값을 출력하기 (같을 경우 a ⊕ b 출력하기)
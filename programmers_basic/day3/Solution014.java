package programmers_basic.day3;

import java.util.Scanner;

public class Solution014 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
		int d = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
		int answer = c > d ? c : d;
		
		System.out.println(answer);
		
		sc.close();
	}
}

// <더 크게 합치기>
// 입력받은 두 정수 a, b를 연산⊕(이어붙이기)하여,
// a ⊕ b와 b ⊕ a 중 더 큰 값을 출력하기
// 예) a = 3, b = 24 --> a ⊕ b = 324, b ⊕ a = 243
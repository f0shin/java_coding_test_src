package programmers_basic.day4;

import java.util.Scanner;

public class Solution016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();
		
		int answer = 0;
		
		answer = num % n == 0 ? 1 : 0;		
		
		System.out.println(answer);
		
		sc.close();
	}
}

// <n의 배수>
// 정수 num, n을 입력받아서 num이 n의 배수이면 1, 아니면 0을 출력하기
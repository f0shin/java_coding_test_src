package programmers_basic.day4;

import java.util.Scanner;

public class Solution017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int answer = 0;
		
		answer = num % n == 0 && num % m == 0 ? 1 : 0;		
		
		System.out.println(answer);
		
		sc.close();
	}

}
// <공배수>
// num, n, m을 입력받아서, num이 n과 m의 배수이면 1, 아니면 0을 출력하기
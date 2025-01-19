package programmers_basic.day1;

import java.util.Scanner;

public class Solution003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
		
		sc.close();
	}

}

// <문자열 반복해서 출력하기>
// 문자열과 숫자를 입력 받아서 문자열을 숫자 만큼 반복하여 출력
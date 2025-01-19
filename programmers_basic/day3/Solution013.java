package programmers_basic.day3;

import java.util.Scanner;

public class Solution013 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String my = sc.next();
		int k = sc.nextInt();

		// 내 답안
//		for (int i = 0; i < k; i++) {
//			answer += my;
//		}
		
		// 다른 답안1 (repeat 활용) --> 이거 외워두자!!
		 String answer = my.repeat(k);
		
		System.out.println(answer);
		sc.close();
	}

}

// <문자열 곱하기>
// 문자열 my, 정수 k를 입력받아서 my를 k번 반복해서 출력하기 

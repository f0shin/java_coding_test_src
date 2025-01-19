package programmers_basic.day4;

import java.util.Scanner;

public class Solution020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String f = sc.next();
		boolean flag = f.equals("true") ? true : false;
		
		int answer = 0;

		answer = flag ? a + b : a - b;

		System.out.println(answer);

		sc.close();
	}
}
// <flag에 따라 다른 값 반환하기>
package programmers_basic.day2;

import java.util.Scanner;

public class Solution010 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String my = sc.next();
		String over = sc.next();
		int s = sc.nextInt();
		
		System.out.println(replaceStr(my, over, s));
		
		sc.close();
	}
	
	public static String replaceStr(String my, String over, int s) {
		
		char[] arrMy = my.toCharArray();
		char[] arrOver = over.toCharArray();
		
		for (int i = 0; i < arrOver.length; i++) {
			arrMy[i + s] = arrOver[i];
		}
		
		my = String.valueOf(arrMy);
		return my;
	}
}

// <문자열 겹쳐쓰기>
// 두 문자열 my와 over, 정수 s를 입력 받아서,
// my의 s번째부터 over의 길이 만큼 over를 덮어쓰는 함수 만들기

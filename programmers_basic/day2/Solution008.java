package programmers_basic.day2;

import java.util.Scanner;

public class Solution008 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 내 답안1 (char배열로 변환해서 for문 돌리기)
//		char[] arrCh = str.toCharArray();
//		for (int i = 0; i < arrCh.length; i++) {
//			System.out.println(arrCh[i]);
//		}
		
		// 내 답안2 (String 그대로 두고 for문 돌리기)
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
		
		// 다른 답안 (for-each 문 활용)
		for (char c : str.toCharArray()) {
			System.out.println(c);
		}
		
		sc.close();
	}

}

// <문자열 돌리기>
// 입력받은 문자열 str을 시계방향으로 90도 돌려서 출력
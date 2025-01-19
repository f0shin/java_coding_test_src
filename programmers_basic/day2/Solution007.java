package programmers_basic.day2;

import java.util.Scanner;

public class Solution007 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		// 내 답안
		//System.out.println(str1 + str2);
		
		// 다른 답안1 (join 활용)
		//System.out.println(String.join("", str1, str2));
		
		// 다른 답안2 (concat 활용)
		System.out.println(str1.concat(str2));
		
		sc.close();
		
	}

}

// <문자열 붙여서 출력하기>
// 입력받은 두 문자열 str1, str2를 붙여서 출력
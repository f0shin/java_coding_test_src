package programmers_basic.day3;

import java.util.Scanner;

public class Solution012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		String[] arr = {str1, str2, str3};
		String answer = "";
		

		// 내 답안
//		for (int i = 0; i < arr.length; i++) {
//			answer += arr[i];
//		}
		
		// 다른 답안1 (for each문)
//		for (String a : arr) {
//			answer += a;
//		}

		// 다른 답안2 (join 활용) --> 이거 좋다!
		answer = String.join("", arr);

		System.out.println(answer);
		
		sc.close();
	}

}

// <문자열 리스트를 문자열로 변환하기>
// String[] arr --> String answer
// {"a", "b", "c"} --> "abc"
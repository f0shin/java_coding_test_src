package programmers_basic.day1;

import java.util.Scanner;

public class Solution004 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 1) 입력 받은 문자열을 char배열로 쪼개기
		char[] arrCh = str.toCharArray();
		// 2) for문으로 하나씩 돌아가면서 대문자면 소문자로, 소문자면 대문자로 바꾸기
		for (int i = 0; i < arrCh.length; i++) {
			if (arrCh[i] >= 65 && arrCh[i] <= 90) { // 대문자 (65 ~ 90)
				arrCh[i] = (char)((int)arrCh[i] + 32);
			} else if (arrCh[i] >= 97 && arrCh[i] <= 122) { // 소문자 (97 ~ 122)
				arrCh[i] = (char)((int)arrCh[i] - 32);
			}
		}
		// 3) char배열로 쪼갠 걸 다시 합쳐서 출력하기
//		str = String.valueOf(arrCh);
//		System.out.println(str);
		System.out.println(String.valueOf(arrCh));
		
		sc.close();
	}
}

// <대소문자 바꿔서 출력하기>
// 입력 받은 문자열(1~20자)을 대소문자 바꿔서 출력
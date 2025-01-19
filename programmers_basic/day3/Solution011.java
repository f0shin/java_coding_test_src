package programmers_basic.day3;

import java.util.Scanner;

public class Solution011 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		int len = str1.length() + str2.length();
		char[] arrTemp = new char[len];  // 빈 배열 만드는 부분에서 헤맸다!
		int j = 0;
		for (int i = 0; i < arrTemp.length; i++) {
			if (i == 0 || i % 2 == 0) {
				arrTemp[i] = str1.charAt(j);
			} else {
				arrTemp[i] = str2.charAt(j);
				j++;
			}
		}
		
		String answer = String.valueOf(arrTemp);

		System.out.println(answer);

		sc.close();
	}
}

//<문자열 섞기>
//두 문자열 번갈아가면서 배치하기?
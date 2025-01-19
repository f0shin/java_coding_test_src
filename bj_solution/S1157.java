package bj_solution;

import java.util.Scanner;

public class S1157 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		str = str.toUpperCase();
		int[] count = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 65]++;
		}
		
		int maxCount = -1;
		int maxIndex = -1;
		
		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				if (count[i] > maxCount) {
					maxCount = count[i];
					maxIndex = i;
				} else if (count[i] == maxCount) {
					maxIndex = -1;
//					break;
				}
			}
		}
		
		if (maxIndex == -1) {
			System.out.println("?");
		} else {
			System.out.println((char)(maxIndex + 65));
		}
		
	}
}

package bj_solution;

import java.util.HashMap;
import java.util.Scanner;

public class S10809 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int[] answer = new int[26]; // a ~ z
		HashMap<Character, Integer> temp = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!temp.containsKey(str.charAt(i))) {
				temp.put(str.charAt(i), i);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			char c = (char)(97 + i);
			if (temp.containsKey(c)) {
				if (answer[i] <= 0) {
					answer[i] = temp.get(c);
				}
			} else {
				answer[i] = -1;
			}
		}
		
		// 출력
		for (int i = 0; i < 26; i++) {
			System.out.print(answer[i] + " ");
		}
		
	}
}

package bj_solution;

import java.util.Scanner;

public class S1316 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rp = sc.nextInt();

		int answer = 0;

		for (int r = 0; r < rp; r++) {
			String str = sc.next();
			
			if (str.length() >= 3) {
				boolean a = true;
				for (int i = 0; i <= str.length() - 3; i++) {
					for (int j = i + 2; j <= str.length() - 1; j++) {
						if (str.charAt(i) == str.charAt(j)) {
							if (str.charAt(j - 1) != str.charAt(j)) {
								a = false;
							}
						}
					}
				}	
				if (a) {
					answer++;
				}
			} else { // 1 ~ 2자리: 그냥 인정
				answer++;
			}
			
		}
		sc.close();
		
		System.out.println(answer);
		
	}
}

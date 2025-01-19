package bj_solution;

import java.util.Scanner;

public class S2941 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			count++;
			
			if (i >= 1 && (c == '=' || c == '-' || c == 'j')) {
				char cm1 = str.charAt(i - 1);
				
				// c=, z=, s=, dz=
				if (c == '=') {
					if (cm1 == 'c' || cm1 == 'z' || cm1 == 's') {
						count--; // 1개 무효
						if (i >= 2 && cm1 == 'z' && str.charAt(i - 2) == 'd') {
							count--; // 2개 무효
						}
					}
				}
				
				// c-, d-
				if (c == '-') {
					if (cm1 == 'c' || cm1 == 'd') {
						count--; // 1개 무효
					}
				}
				
				// lj, nj
				if (c == 'j') {
					if (cm1 == 'l' || cm1 == 'n') {
						count--; // 1개 무효
					}
				}
			}

		}
		
		System.out.println(count);
		
	}
}

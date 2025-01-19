package bj_solution;

import java.util.Scanner;

public class S10809_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		// 출력
		for (char c = 'a'; c <= 'z'; c++) {
			int i = str.indexOf(c);
			System.out.print(i + " ");
		}
		
	}
}

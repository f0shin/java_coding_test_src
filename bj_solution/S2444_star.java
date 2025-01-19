package bj_solution;

import java.util.Scanner;

public class S2444_star {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int blankRp = sc.nextInt() - 1;
		sc.close();
		
		// blank:  4 -> 3 -> 2 -> 1 -> 0 / -> 1 -> ... -> 0
		// star: 1 -> 3 -> 5 -> 7 -> 9 / -> 7 -> ... -> 1
		
		int starRp = 1;
		
		for (int i = 0; i < blankRp; i++) { // 0 ~ 3
			System.out.print(" ".repeat(blankRp - i) + "*".repeat(starRp) + "\n");
			starRp += 2;
		}
		
		for (int i = blankRp; i >= 0; i--) { // 4 ~ 8
			System.out.print(" ".repeat(blankRp - i) + "*".repeat(starRp) + "\n");
			starRp -= 2;
		}
		
	}
}

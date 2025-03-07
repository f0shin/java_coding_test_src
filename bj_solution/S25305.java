package bj_solution;

import java.util.Scanner;

public class S25305 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rp = sc.nextInt();
		int cut = sc.nextInt();
		
		int[] student = new int[rp];
		
		for (int i = 0; i < rp; i++) {
			student[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < rp - 1; i++) {
			for (int j = i + 1; j < rp; j++) {
				if (student[j] > student[i]) {
					int temp = student[j];
					student[j] = student[i];
					student[i] = temp;
				}
			}
		}
		
		System.out.println(student[cut - 1]);

	}

}

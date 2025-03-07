package bj_solution;

import java.util.Scanner;

public class S2750 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rp = sc.nextInt();
		int[] num = new int[rp];
		
		for (int i = 0; i < rp; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		// 정렬
		for (int i = 0; i < rp - 1; i++) {
			for (int j = i + 1; j < rp; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < rp; i++) {
			System.out.println(num[i]);
		}
		
	}

}

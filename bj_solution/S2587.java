package bj_solution;

import java.util.Scanner;

public class S2587 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		int ave = 0;
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			sum += num[i];
		}
		
		ave = sum / 5;
		
		System.out.println(ave);
		System.out.println(num[2]);

	}

}

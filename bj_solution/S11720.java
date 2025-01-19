package bj_solution;

import java.util.Scanner;

public class S11720 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rp = sc.nextInt();
		String str = sc.next();
		sc.close();
		
		int sum = 0;
		for (int i = 0; i < rp; i++) {
			int temp = Integer.parseInt(str.split("")[i]);
			sum += temp;
		}
		
		System.out.println(sum);

	}
}

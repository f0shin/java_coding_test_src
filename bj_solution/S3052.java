package bj_solution;

import java.util.ArrayList;
import java.util.Scanner;

public class S3052 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			int d = n % 42;
			if (!temp.contains(d)) {
				temp.add(d);
			}
		}
		sc.close();
		
		System.out.println(temp.size());

	}
}

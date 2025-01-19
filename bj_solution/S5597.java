package bj_solution;

import java.util.ArrayList;
import java.util.Scanner;

public class S5597 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean[] yes = new boolean[30];
		
		for (int i = 0; i < 8; i++) {
			int a = sc.nextInt();
			yes[a - 1] = true;
		}
		
		ArrayList<Integer> no = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			if (yes[i] == false) {
				no.add(i + 1);
				if (no.size() == 2) break;
			}
		}
		
		no.sort(null);
		
		System.out.println(no.get(0));
		System.out.println(no.get(1));

		sc.close();

	}
}

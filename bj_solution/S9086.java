package bj_solution;

import java.util.Scanner;

public class S9086 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rp = sc.nextInt();
		String[] strList = new String[rp];
		for (int i = 0; i < rp; i++) {
			strList[i] = sc.next();
		}
		sc.close();
		
		for (int i = 0; i < rp; i++) {
			System.out.println(String.valueOf(strList[i].charAt(0)) 
					+ String.valueOf(strList[i].charAt(strList[i].length() - 1)));
		}
		
	}
}

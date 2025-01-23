package bj_solution;

import java.util.Scanner;

public class S2745 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		sc.close();
		
		String n = str.split(" ")[0]; // n
		int b = Integer.parseInt(str.split(" ")[1]); // b진법 
		
		long answer = 0;
		long d = 1; // 자릿수
		
		// A(65) = 10, Z(90) = 35
		
		for (int i = n.length() - 1; i >= 0; i--) {
			long temp = 0;
			if (n.charAt(i) >= 65) { // 10 ~ 35
				temp = (n.charAt(i) - 55) * d;
			} else { // 1 ~ 9
				temp = Integer.parseInt(n.split("")[i]) * d;
			}
			
			answer += temp;
			d = d * b;
		}
		
		System.out.println(answer);
		
	}
}

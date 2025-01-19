package bj_solution;

import java.util.Scanner;

public class S1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		double max = 0;
		double[] score = new double[count];
		
		// 1) 점수 입력받기 + 최대값 찾기
		for (int i = 0; i < count; i++) {
			double a = sc.nextDouble();
			score[i] = a;
			max = max < a ? a : max;
		}
		
		sc.close();
		
		double tot = 0;
		
		// 2) 점수 조작하기 + 조작한 점수 총 합계 구하기
		for (int i = 0; i < count; i++) {
			double temp = (score[i] / max) * 100d;
			tot += temp;
		}
		
		// 3) 조작한 점수로 평균 구하기
		System.out.println(tot / count);
		
	}
}

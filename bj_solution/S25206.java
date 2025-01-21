package bj_solution;

import java.util.Scanner;

public class S25206 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String subject = ""; // 0. 과목명 (거들뿐)
		double credit = 0.0; // 1. 학점
		String strGrade = ""; // 2. 등급
		double grade = 0.0; // 과목평점 = 등급 환산
		
		double totCredit = 0.0; // 전체 학점 = 학점의 총합
		double totGrade = 0.0; // 전체 평점 = 학점 * 과목평점
		double result = 0.0; // 전공평점 = 전체 평점 / 전체 학점
		
		for (int i = 0; i < 20; i++) {
			
			String str = sc.nextLine();
			
			credit = Double.valueOf(str.split(" ")[1]);
			strGrade = str.split(" ")[2];
			
			if (!strGrade.equals("P")) {
				grade = getGrade(strGrade);
				
				totGrade += (grade * credit);
				totCredit += credit;
			}
			
		}
		sc.close();
		
		result = totGrade / totCredit;
		System.out.println(result);
		
	}
	public static double getGrade(String strGrade) {
		
		switch (strGrade) {
		
		case "A+": return 4.5;
		case "A0": return 4.0;
		case "B+": return 3.5;
		case "B0": return 3.0;
		case "C+": return 2.5;
		case "C0": return 2.0;
		case "D+": return 1.5;
		case "D0": return 1.0;
		case "F":
		default: return 0.0;

		}
		
	}
}

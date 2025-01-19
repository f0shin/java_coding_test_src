package programmers_basic.day5;

import java.util.Scanner;

public class Solution023 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		System.out.println(solution(a, b, c));
	}

	public static int solution(int a, int b, int c) {
        int answer = 0;
        
        answer = a + b + c;
        answer *= (a == b && a == c && b == c) ?(a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c) : (a == b || a == c || b == c) ? (a * a + b * b + c * c) : 1;
        
        return answer;
    }

}

// <주사위 게임2>

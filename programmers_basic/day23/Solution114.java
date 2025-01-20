package programmers_basic.day23;

public class Solution114 {
	public static void main(String[] args) {

		int a = 3;
		int b = 5;

		System.out.println(solution(a, b));

	}

	public static int solution(int a, int b) {
		
        int answer = 0;
        
        if (a % 2 == 1 && b % 2 == 1) {
            answer = (a * a) + (b * b);
        } else if (a % 2 == 1 || b % 2 == 1) {
        	answer = 2 * (a + b);
        } else if (a % 2 == 0 && b % 2 == 0) {
        	answer = a - b;
            if (answer < 0) {
            	answer *= -1;
            }
        }
        
        return answer;
        
    }
}
// <주사위 게임1>
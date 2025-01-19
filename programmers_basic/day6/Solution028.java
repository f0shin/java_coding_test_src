package programmers_basic.day6;

public class Solution028 {
	public static void main(String[] args) {
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		
		String result = solution(numLog);
		
		System.out.println(result);
	}
	
	public static String solution(int[] numLog) {
        String answer = "";

        for (int i = 0; i < numLog.length - 1; i++) {
            switch (numLog[i + 1] - numLog[i]) {
                case 1: answer += "w"; break;
                case -1: answer += "s"; break;
                case 10: answer += "d"; break;
                case -10: answer += "a"; break;
            }
        }
        return answer;
    }

}

// <수 조작하기2>
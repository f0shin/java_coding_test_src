package programmers_basic.day21;

public class Solution104 {
	public static void main(String[] args) {

		String num_str = "123456789";

		System.out.println(solution(num_str));
		
	}

	public static int solution(String num_str) {
		
        int answer = 0;
        
        for (char c : num_str.toCharArray()) {
            int temp = Integer.parseInt(String.valueOf(c));
            answer += temp;    
        }
        
        return answer;
        
    }
}
// <문자열 정수의 합>
package programmers_basic.day21;

public class Solution105 {
	public static void main(String[] args) {

		String n_str = "8542";

		System.out.println(solution(n_str));
		
	}

	public static int solution(String n_str) {
		
//        int answer = Integer.valueOf(n_str);
        int answer = Integer.parseInt(n_str);
        
        return answer;
        
    }
}
// <문자열을 정수로 변환하기>
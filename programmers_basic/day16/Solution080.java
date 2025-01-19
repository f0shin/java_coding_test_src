package programmers_basic.day16;

public class Solution080 {
	public static void main(String[] args) {

		String my_string = "programmers";
		String alp = "p";

		System.out.println(solution(my_string, alp));

	}
	
	public static String solution(String my_string, String alp) {
		
        String answer = my_string.toLowerCase().replace(alp, alp.toUpperCase());
        
        return answer;
        
    }
}
// <특정한 문자를 대문자로 바꾸기>
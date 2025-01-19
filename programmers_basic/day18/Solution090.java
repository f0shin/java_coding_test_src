package programmers_basic.day18;

public class Solution090 {
	public static void main(String[] args) {

		String rny_string = "programmers";
		
		System.out.print(solution(rny_string));

	}

	public static String solution(String rny_string) {
		
        String answer = rny_string.replace("m", "rn");
        return answer;
        
    }
}
// <rny_string>
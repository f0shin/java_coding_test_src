package programmers_basic.day24;

public class Solution119 {
	public static void main(String[] args) {

		String a = "abcdevwxyz";

		System.out.println(solution(a));

	}

	public static String solution(String myString) {
		
        String answer = myString;

//        for (char c = 'a'; c < 'l'; c++) {
//            answer = answer.replace(String.valueOf(c), "l");
//        }
        
        answer = answer.replaceAll("[^l-z]", "l"); // 정규식 활용

        return answer;
        
    }
}
// <l로 만들기>
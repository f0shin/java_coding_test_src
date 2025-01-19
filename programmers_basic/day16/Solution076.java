package programmers_basic.day16;

public class Solution076 {
	public static void main(String[] args) {

		String myString = "aBcDeFg";
		
		System.out.println(solution(myString));
		
	}
	
	public static String solution(String myString) {
		
        String answer = myString.toUpperCase();
        
        return answer;
        
    }
}
// <대문자로 바꾸기>
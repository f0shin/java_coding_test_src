package programmers_basic.day23;

public class Solution111 {
	public static void main(String[] args) {

		String a = "abc";
		String b = "aabcc";

		System.out.println(solution(a, b));

	}
	
	public static int solution(String str1, String str2) {
		
        return str2.contains(str1) ? 1 : 0;
        
    }
}
// <부분 문자열>
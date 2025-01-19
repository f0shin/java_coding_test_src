package programmers_basic.day10;

public class Solution046 {
	public static void main(String[] args) {
		
		String a = "ProgrammerS123";
		int b = 11;
		
		System.out.println(solution(a, b));

	}

	public static String solution(String my_string, int n) {
		
        return my_string.substring(0, n);
        
    }
}

// <문자열의 앞의 n글자>

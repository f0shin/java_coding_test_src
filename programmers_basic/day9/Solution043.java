package programmers_basic.day9;

public class Solution043 {
	public static void main(String[] args) {

		String a = "ProgrammerS123";
		int b = 11;

		System.out.println(solution(a, b));

	}

	public static String solution(String my_string, int n) {
		
		return my_string.substring(my_string.length() - n);
		
	}

}

// <문자열 뒤의 n글자>

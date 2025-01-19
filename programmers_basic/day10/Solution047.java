package programmers_basic.day10;

public class Solution047 {
	public static void main(String[] args) {

		String a = "banana";
		String b = "ban";
		String c = "abcd";

		System.out.println(solution(a, b));
		System.out.println(solution(a, c));

	}

	public static int solution(String my_string, String is_prefix) {
		
		return my_string.startsWith(is_prefix) ? 1 : 0;
		
	}

}

// <접두사인지 확인하기>
// 저번에 배운 endsWith 응용해봤다!
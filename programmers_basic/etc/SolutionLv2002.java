package programmers_basic.etc;

public class SolutionLv2002 {

	public static void main(String[] args) {
		String s1 = "()()";
		String s2 = "(())()";
		String s3 = ")()(";
		String s4 = "(()(";

		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));

	}

	public static boolean solution(String s) {
		boolean answer = true;

		int p = 0;
		int i = 0;

		while (p >= 0 && i < s.length()) {
			p = s.charAt(i) == '(' ? p + 1 : p - 1;
			i++;
		}
		answer = (p == 0);

		return answer;
	}

}

package programmers_basic.day22;

import java.math.BigInteger;

public class Solution107_bi {
	public static void main(String[] args) {

		String a = "18446744073709551615";
		String b = "287346502836570928366";

		System.out.println(solution(a, b));

	}

	public static String solution(String a, String b) {

		String answer = "";

		if (a.length() <= 19 && b.length() <= 19) {
			answer = String.valueOf(Long.parseLong(a) + Long.parseLong(b));
			return answer;
		}
		
		BigInteger biA = new BigInteger(a);
		BigInteger biB = new BigInteger(b);
		BigInteger biSum = biA.add(biB);
		
		answer = biSum.toString();

		return answer;

	}
}
// <두 수의 합>
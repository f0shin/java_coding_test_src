package programmers_basic.day8;

public class Solution039 {
	public static void main(String[] args) {
		
		String a = "78720646226947352489";
		int result = solution(a);

		System.out.print(result);

	}

	public static int solution(String number) {

		int answer = 0;
		int temp = 0;

		for (int i = 0; i < number.length(); i++) {
			temp += Character.getNumericValue(number.charAt(i));
		}

		answer = temp % 9;

		return answer;
	}

}

// <9로 나눈 나머지>
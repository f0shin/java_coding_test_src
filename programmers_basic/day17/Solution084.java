package programmers_basic.day17;

public class Solution084 {
	public static void main(String[] args) {

		String myString = "i love you";

		String[] result = solution(myString);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static String[] solution(String my_string) {

		String[] answer = my_string.split(" ");
		
        return answer;
        
    }
}
// <공백으로 구분하기1>
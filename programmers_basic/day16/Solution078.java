package programmers_basic.day16;

public class Solution078 {
	public static void main(String[] args) {

		String[] strArr = { "AAA","BBB","CCC","DDD" };

		String[] result = solution(strArr);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static String[] solution(String[] strArr) {
		
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        
        return answer;
        
    }
}
// <배열에서 문자열 대소문자 변환하기>
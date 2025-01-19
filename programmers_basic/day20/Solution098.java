package programmers_basic.day20;

public class Solution098 {
	public static void main(String[] args) {

		String[] strArr = { "a","bc","d","efg","hi" };

		System.out.print(solution(strArr));

	}

	public static int solution(String[] strArr) {
		
        int answer = 0;
        int[] temp = new int[30];

        for (int i = 0; i < strArr.length; i++) {
            temp[strArr[i].length() - 1]++;
        }

        for (int i = 0; i < 30; i++) {
            answer = answer < temp[i] ? temp[i] : answer;
        }

        return answer;
        
    }
}
// <문자열 묶기>
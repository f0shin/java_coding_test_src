package programmers_basic.day9;

import java.util.ArrayList;

public class Solution045 {
	public static void main(String[] args) {

		String a = "banana";
		String b = "ana";
		String c = "wxyz";

		System.out.println(solution(a, b));
		System.out.println(solution(a, c));

	}

	public static int solution(String my_string, String is_suffix) {
		
        int answer = 0;
        
        // 나의 풀이..
        // 1) 접미사 모으기
        ArrayList<String> temp = new ArrayList<> ();
        
        for (int i = 0; i < my_string.length(); i++) {
            temp.add(my_string.substring(i));
        }
        
        // 2) 접미사인지 확인하기(존재하는지? 존재하면 1, 아님 0)
        answer = temp.contains(is_suffix) ? 1 : 0;
        
        
        // 더욱 심플한 다른 사람 풀이! --> endsWith 메서드 활용
//        answer = my_string.endsWith(is_suffix) ? 1 : 0;
        
        return answer;
        
    }
}
// <접미사인지 확인 하기>
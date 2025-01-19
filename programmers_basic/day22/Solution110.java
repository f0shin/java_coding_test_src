package programmers_basic.day22;

public class Solution110 {
	public static void main(String[] args) {

		String my_string = "banana";
		String target1 = "ana";
		String target2 = "wxyz";
		
		System.out.println(solution(my_string, target1));
		System.out.println(solution(my_string, target2));

	}

	public static int solution(String my_string, String target) {
		
        int answer = my_string.contains(target) ? 1 : 0;
        return answer;
        
    }
}
// <부분 문자열인지 확인하기>
package programmers_basic.day5;

public class Solution022 {
	public static void main(String[] args) {
		
		int a = 7;
		int d = 1;
		boolean[] included = {false, false, false, true, false, false, false};

		System.out.println(solution(a, d, included));
	}

	public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for (int i = 0; i < included.length; i++) {
            answer += included[i] ? a + (d * i) : 0;
        }  
     
        return answer;
    }

}
// <등차수열의 특정한 항만 더하기>
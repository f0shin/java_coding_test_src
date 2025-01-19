package programmers_basic.day17;

public class Solution082 {
	public static void main(String[] args) {

		String myString = "banana";
		String pat = "ana";
		
		System.out.println(solution(myString, pat));
		
	}
	
	public static int solution(String myString, String pat) {
        
		int answer = 0;
        
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
        	String temp = myString.substring(i, i + pat.length());
            if (temp.equals(pat)) {
                answer++;
            }
        }
        
        return answer;
        
    }
}
// <문자열이 몇 번 등장하는지 세기>
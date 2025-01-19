package programmers_basic.day6;

public class Solution027 {
	public static void main(String[] args) {
		int n = 0;
		String control = "wsdawsdassw";
		
		int result = solution(n, control);
		System.out.println(result);
	}
	
	public static int solution(int n, String control) {
        int answer = n;
        
        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w': answer++; break;
                case 's': answer--; break;
                case 'd': answer += 10; break;
                case 'a': answer -= 10; break;
            }
        }
        return answer;
    }

}

// <수 조작하기1>
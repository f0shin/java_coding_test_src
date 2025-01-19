package programmers_basic.day11;

public class Solution054 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		int[] result = solution(a, b);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
		
	}
	
	public static int[] solution(int start_num, int end_num) {
		
        int[] answer = new int[start_num - end_num + 1];
        int i = 0;

        for (int num = start_num; num >= end_num; num--) {
            answer[i] = num;
            i++;
        }

        return answer;
        
    }
}
// <카운트 다운>
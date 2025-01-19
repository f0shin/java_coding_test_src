package programmers_basic.day13;

public class Solution061 {
	public static void main(String[] args) {

		int[] num_list = { 5, 2, 1, 7, 5 };
		int n = 2;

		int[] result = solution(num_list, n);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] num_list, int n) {
		
        int[] answer = new int[num_list.length - n + 1];
        int j = 0;

        for (int i = n - 1; i < num_list.length; i++) {
            answer[j] = num_list[i];
            j++;
        }

        return answer;
        
    }
}
// <n 번째 원소부터>
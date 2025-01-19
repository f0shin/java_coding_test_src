package programmers_basic.day5;

public class Solution024 {

	public static void main(String[] args) {

		int[] num_list = {3, 4, 5, 2, 1};
		
		System.out.println(solution(num_list));
	}

	public static int solution(int[] num_list) {
		int answer = 0;

		int prd = 1;
		int sum = 0;

		for (int i = 0; i < num_list.length; i++) {
			prd *= num_list[i];
			sum += num_list[i];
		}
		sum *= sum;
		answer = prd < sum ? 1 : 0;

		return answer;
	}
}
// <원소들의 곱의 합>
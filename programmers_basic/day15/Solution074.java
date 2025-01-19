package programmers_basic.day15;

public class Solution074 {
	public static void main(String[] args) {

		int[] num_list1 = { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 };
		int[] num_list2 = { 2, 3, 4, 5 };

		System.out.println(solution(num_list1));
		System.out.println(solution(num_list2));

	}

	public static int solution(int[] num_list) {

        int answer = 0;

        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else { // num_list.length <= 10
            answer = 1;
            for (int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }

        return answer;
        
    }
}
// <길이에 따른 연산>
package programmers_basic.day20;

public class Solution097 {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 3, 3, 3, 3 };

		System.out.print(solution(arr1, arr2));

	}

	public static int solution(int[] arr1, int[] arr2) {

        int answer = 0;

        if (arr1.length != arr2.length) {
            answer = arr1.length > arr2.length ? 1 : -1;
            return answer;
        }

        int tot1 = 0;
        int tot2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            tot1 += arr1[i];
            tot2 += arr2[i];
        }

        if (tot1 > tot2) {
            answer = 1;
        } else if (tot1 < tot2) {
            answer = -1;
        } else if (tot1 == tot2) {
            answer = 0;
        }

        return answer;

    }
}
// <배열 비교하기>

package programmers_basic.day7;

import java.util.Stack;

public class Solution035_Stack {
	public static void main(String[] args) {
		
		int[] a = { 1, 4, 2, 5, 3 };
		int[] result = solution(a);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(int[] arr) {

		Stack<Integer> stkTemp = new Stack<> ();
		int i = 0;
		
		while (i < arr.length) {
			if (stkTemp.empty()) { // stkTemp가 비었다면, stkTemp에 arr[i]를 추가하고 i++
				stkTemp.push(arr[i]);
				i++;
			} else { // stkTemp에 원소가 있고,
				if (stkTemp.peek() < arr[i]) { // stkTemp의 마지막 원소가 arr[i] 보다 작으면 stkTemp에 arr[i]를 추가하고 i++
					stkTemp.push(arr[i]);
					i++;
				} else { // stkTemp의 마지막 원소가 arr[i] 보다 크거나 같으면 stkTemp의 마지막 원소를 삭제
					stkTemp.pop();
				}
			}
		}

		int[] stk = new int[stkTemp.size()];

		for (int j = (stk.length - 1); j >= 0; j--) {
			stk[j] = stkTemp.pop();
		}

		return stk;
	}

}
// <배열 만들기4>
// 다른 사람의 풀이 참고
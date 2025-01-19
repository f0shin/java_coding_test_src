package programmers_basic.day7;

import java.util.ArrayList;

public class Solution035_ArrayList {
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

		ArrayList<Integer> stkTemp = new ArrayList<>();
		int i = 0;

		while (i < arr.length) {
			if (stkTemp.size() == 0) { // stkTemp가 빈 배열이라면, stkTemp에 arr[i]를 추가하고 i++
				stkTemp.add(arr[i]);
				i++;
			} else { // stkTemp에 원소가 있고,
				if (stkTemp.get(stkTemp.size() - 1) < arr[i]) { // stkTemp의 마지막 원소가 arr[i] 보다 작으면 stkTemp에 arr[i]를 추가하고 i++
					stkTemp.add(arr[i]);
					i++;
				} else { // stkTemp의 마지막 원소가 arr[i] 보다 크거나 같으면 stkTemp의 마지막 원소를 삭제
					stkTemp.remove(stkTemp.size() - 1);
				}
			}
		}

		int[] stk = new int[stkTemp.size()];

		for (int j = 0; j < stk.length; j++) {
			stk[j] = stkTemp.get(j);
		}

		return stk;
	}

}
// <배열 만들기4>
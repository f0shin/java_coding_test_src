package programmers_basic.day12;

import java.util.ArrayList;

public class Solution056 {
	public static void main(String[] args) {

		int[] slicer = { 1, 5, 2 };
		int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int n = 2;
		
		int[] result = solution(n, slicer, num_list);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
		
	}

	public static int[] solution(int n, int[] slicer, int[] num_list) {
		
		ArrayList<Integer> temp = new ArrayList<>();
		int a = 0;
		int b = 0;
		int c = 0;
		
		switch (n) {
		case 1:
			a = 0;
			b = slicer[1];
			c = 1;
			break;
			
		case 2:
			a = slicer[0];
			b = num_list.length - 1;
			c = 1;
			break;
			
		case 3:
			a = slicer[0];
			b = slicer[1];
			c = 1;
			break;
			
		case 4:
			a = slicer[0];
			b = slicer[1];
			c = slicer[2];
			break;
			
		}
		
		for (int i = a; i <= b; i += c) {
			temp.add(num_list[i]);
		}

		int[] answer = new int[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			answer[i] = temp.get(i);
		}

		return answer;
		
	}
}
// <리스트 자르기>

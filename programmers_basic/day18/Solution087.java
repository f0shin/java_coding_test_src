package programmers_basic.day18;

import java.util.ArrayList;
//import java.util.Arrays;

public class Solution087 {
	public static void main(String[] args) {

		String myString = "dxccxbbbxaaaaxxa";

		String[] result = solution(myString);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static String[] solution(String myString) {

		String[] str = myString.split("x");
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                temp.add(str[i]);
            }
        }
        
        temp.sort(null);
        //Arrays.sort(answer);
        
        String[] answer = temp.toArray(new String[temp.size()]);
        return answer;
        
	}
}
// <문자열 잘라서 정렬하기>
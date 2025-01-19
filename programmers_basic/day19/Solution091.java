package programmers_basic.day19;

import java.util.ArrayList;

public class Solution091 {
	public static void main(String[] args) {

		String myString = "baconlettucetomato";

		String[] result = solution(myString);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static String[] solution(String myStr) {
		
		ArrayList<String> temp = new ArrayList<>();
		
        for (String s : myStr.split("a|b|c")) {
            if (!s.equals("")) {
                temp.add(s);
            }
        }
        
        if (temp.size() == 0) {
            return new String[]{ "EMPTY" };
        }
        
        return temp.toArray(new String[temp.size()]);
        
    }
}
// <세 개의 구분자>

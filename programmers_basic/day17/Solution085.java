package programmers_basic.day17;

import java.util.ArrayList;

public class Solution085 {
	public static void main(String[] args) {

		String my_string = " i    love  you";

		String[] result = solution(my_string);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}
	
	public static String[] solution(String my_string) {

        String[] my = my_string.split(" ");
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < my.length; i++) {
            if (!my[i].equals("")) {
                temp.add(my[i]);
            }
        }

        return temp.toArray(new String[temp.size()]);
        
    }
}
// <공백으로 구분하기2>
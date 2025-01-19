package programmers_basic.day13;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution063 {
	public static void main(String[] args) {
		
		String[] str_list = { "u", "u", "l", "r" };

		String[] result = solution2(str_list);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
		
	}
	
	// 나의 답안
	public static String[] solution1(String[] str_list) {
		
        int s = -1;
        int s_len = str_list.length;
        
        for (int i = 0; i < s_len; i++) {
            if ((str_list[i].equals("l") || str_list[i].equals("r")) && s == -1) {
                s = i;
            }
        }
        
        if (s == -1) {
            String[] answerFail = {};
            return answerFail;
        }
        
        ArrayList<String> temp = new ArrayList<>();
        
        if (str_list[s].equals("l")) {
            for (int i = 0; i < s; i++) { // 0 ~ s-1
                temp.add(str_list[i]); 
            }
        } else if (str_list[s].equals("r")) {
            for (int i = (s + 1); i < s_len; i++) { // s+1 ~ s_len-1
                temp.add(str_list[i]);
            }
        }
        
        String[] answer = new String[temp.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
        
    }
	
	// 다른 사람들의 답안.. --> copyOfRange 활용!!
	public static String[] solution2(String[] str_list) {

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i); // 0 ~ i-1
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length); // i+1 ~ len-1
            }
        }

        return new String[0]; // 빈 리스트 return
        
    }
}
// <왼쪽 오른쪽>
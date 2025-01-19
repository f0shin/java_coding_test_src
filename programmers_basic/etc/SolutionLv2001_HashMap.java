package programmers_basic.etc;

import java.util.HashMap;
import java.util.Map;

public class SolutionLv2001_HashMap {
	public static void main(String[] args) {
		String[] rec = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };

		String[] answer = Solution(rec);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

	public static String[] Solution(String[] rec) {
		int len = rec.length;
		int a_len = 0;

		// 1) 데이터 가공
		Map<String, String> map = new HashMap<String, String>();
		String[][] user = new String[len][3];
		
		for (int i = 0; i < len; i++) {
			user[i][0] = rec[i].split(" ")[0]; // type
			user[i][1] = rec[i].split(" ")[1]; // uid
			
			// name
			if  (user[i][0].equals("Enter") || user[i][0].equals("Change")) {
				user[i][2] = rec[i].split(" ")[2];
				map.put(user[i][1], user[i][2]); // map 등록
			}
			
			if (user[i][0].equals("Enter") || user[i][0].equals("Leave"))
				a_len++;
		}

		String[] answer = new String[a_len];
		int n = 0;

		// 2) answer 채우기
		for (int i = 0; i < len; i++) {
			switch (user[i][0]) {
			case "Enter":
				answer[n] = map.get(user[i][1]) + "님이 들어왔습니다.";
				n++;
				break;
			case "Leave":
				answer[n] = map.get(user[i][1]) + "님이 나갔습니다.";
				n++;
				break;
			}

		}

		return answer;

	}

}

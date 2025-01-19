package programmers_basic.etc;

public class SolutionLv2001_If {
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
		String[] temp = new String[3];
		String[] arrType = new String[len];
		String[] arrUid = new String[len];
		String[] arrName = new String[len];

		int[] arrIndex = new int[len];
		int a_len = 0;

		// 1) 데이터 가공
		for (int i = 0; i < len; i++) {
			temp = rec[i].split(" ");

			arrType[i] = temp[0]; // type
			arrUid[i] = temp[1]; // uid
			if (temp[0].equals("Enter") || temp[0].equals("Leave"))
				a_len++;
			if (temp[0].equals("Enter") || temp[0].equals("Change"))
				arrName[i] = temp[2]; // name
		}

		String[] answer = new String[a_len];
		int idx = 0;

		// 2) answer 채우기
		for (int i = 0; i < len; i++) {
			// Enter(1) 입장
			if (arrType[i].equals("Enter")) {
				answer[idx] = arrName[i] + "님이 들어왔습니다.";
				arrIndex[i] = idx;
				idx++;
			}

			// Enter(2) 입장+닉변 or Change 닉변
			if (arrType[i].equals("Enter") || arrType[i].equals("Change")) {
				for (int j = 0; j < i; j++) {
					if (arrUid[i].equals(arrUid[j])) { // uid 같으면,
						if (arrType[j].equals("Enter")) {
							answer[arrIndex[j]] = arrName[i] + "님이 들어왔습니다.";
						} else if (arrType[j].equals("Leave")) {
							answer[arrIndex[j]] = arrName[i] + "님이 나갔습니다.";
						}
					}
				}
			}

			// Leave 퇴장
			if (arrType[i].equals("Leave")) {
				for (int j = 0; j < i; j++) {
					if (arrUid[i].equals(arrUid[j])) { // uid 같고 type "Enter" 이면,
						answer[idx] = arrName[j] + "님이 나갔습니다.";
						arrIndex[i] = idx;
					}
				}
				idx++;
			}

		} // for 전체

		return answer;

	}

}
// <오픈채팅방> --> if 버전
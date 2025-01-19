package programmers_basic.etc;

public class SolutionLv2001_Switch {

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
		String[][] data = new String[len][3];

		int[] arrIndex = new int[len];
		int a_len = 0;

		// 1) 데이터 가공
		for (int i = 0; i < len; i++) {
			temp = rec[i].split(" ");

			data[i][0] = temp[0]; // type
			data[i][1] = temp[1]; // id
			if (temp[0].equals("Enter") || temp[0].equals("Leave"))
				a_len++;
			if (temp[0].equals("Enter") || temp[0].equals("Change"))
				data[i][2] = temp[2]; // name
		}

		String[] answer = new String[a_len];
		int idx = 0;

		// 2) answer 채우기
		for (int i = 0; i < len; i++) {

			switch (data[i][0]) {
			case "Enter": // 입장
				answer[idx] = data[i][2] + "님이 들어왔습니다.";
				arrIndex[i] = idx;
				idx++;

				// + 닉변
				for (int j = 0; j < i; j++) {
					if (data[i][1].equals(data[j][1]) && !(data[i][2].equals(data[j][2]))) { // 1-id 비교 and 2-name 비교
						if (data[j][0].equals("Enter")) { // 0-type="Enter"
							answer[arrIndex[j]] = data[i][2] + "님이 들어왔습니다.";
						} else if (data[j][0].equals("Leave")) { // 0-type="Leave"
							answer[arrIndex[j]] = data[i][2] + "님이 나갔습니다.";
						}
					}
				}
				break;

			case "Change": // 닉변
				for (int j = 0; j < i; j++) {
					if (data[i][1].equals(data[j][1]) && !(data[i][2].equals(data[j][2]))) { // 1-id 비교 and 2-name 비교
						if (data[j][0].equals("Enter")) { // 0-type="Enter"
							answer[arrIndex[j]] = data[i][2] + "님이 들어왔습니다.";
						} else if (data[j][0].equals("Leave")) { // 0-type="Leave"
							answer[arrIndex[j]] = data[i][2] + "님이 나갔습니다.";
						}
					}
				}
				break;

			case "Leave": // 퇴장
				for (int j = 0; j < i; j++) {
					if (data[i][1].equals(data[j][1]) && data[j][0].equals("Enter")) { // 1-id 비교 and 0-type="Enter"
						answer[idx] = data[j][2] + "님이 나갔습니다.";
						arrIndex[i] = idx;
					}
				}
				idx++;
				break;
			} // Switch 전체

		} // for 전체

		return answer;

	}

}
// <오픈채팅방> --> switch 버전

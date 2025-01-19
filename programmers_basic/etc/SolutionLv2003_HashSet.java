package programmers_basic.etc;

public class SolutionLv2003_HashSet {
	public static void main(String[] args) {
		int n = 2;
		String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };

		int[] result = solution(n, words);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
	}

	public static int[] solution(int n, String[] words) {

		// int n: 참여하는 사람의 수
		// String[] words: 단어 목록
		int failedUserNumber = 0; // 가장 먼저 탈락하는 사람의 번호
		int failedUserTimes = 0; // 그 사람이 자신의 몇 번째 발언에서 탈락하는지

		java.util.HashSet<String> words_list = new java.util.HashSet<String>(); // words --> words_list
		int[][] usersInfo = new int[n][4]; // 0-발언 횟수, 1-규칙3 pass여부, 2-규칙4 pass여부, 3-규칙5 pass여부
		// usersInfo 초기화
		for (int i = 0; i < n; i++) {
			usersInfo[i][0] = 0; // 0번째 발언
			usersInfo[i][1] = 1; // 규칙3 pass
			usersInfo[i][2] = 1; // 규칙4 pass
			usersInfo[i][3] = 1; // 규칙5 pass
		}

		int pass = 1; // 규칙 pass 여부 (기본값: 1-pass)
		int currentUserNumber = 1; // 현재 차례인 사람의 번호 (기본값: 1번)

		for (int t = 0; t < words.length; t++) {
			currentUserNumber = (t % n) + 1; // 현재 차례인 사람의 번호
			usersInfo[currentUserNumber - 1][0]++; // 차례가 올 때마다 1 증가

			// 규칙3~5 pass 여부 판단
			if (t > 0) {
				String a = words[t - 1].substring(words[t - 1].length() - 1, words[t - 1].length());
				String b = words[t].substring(0, 1);
				usersInfo[currentUserNumber - 1][1] = a.equals(b) ? 1 : 0; // 이전 단어의 마지막 문자로 시작되어야 하고(규칙3)
				usersInfo[currentUserNumber - 1][3] = words[t].length() > 1 ? 1 : 0; // 1글자 이상이어야 함(규칙5)
				usersInfo[currentUserNumber - 1][2] = !(words_list.contains(words[t])) ? 1 : 0; // 단어가 중복되지 않고(규칙4)
			}

			pass = usersInfo[currentUserNumber - 1][1] == 1 && usersInfo[currentUserNumber - 1][2] == 1
					&& usersInfo[currentUserNumber - 1][3] == 1 ? 1 : 0; // 규칙3~5 모두 pass인 경우 pass

			// pass 일때 words_list 등록
			switch (pass) {
			case 1:
				words_list.add(words[t]);  // words_list에 (단어, "") 등록
				break;
			case 0:
				if (failedUserNumber == 0) { // 처음으로 실패한 사람 등록
					failedUserNumber = currentUserNumber;
					failedUserTimes = usersInfo[currentUserNumber - 1][0];
				}
				break;
			}
		} // 전체 for

		int[] answer = { failedUserNumber, failedUserTimes };

		return answer;
	}

}

// <영어 끝말잇기>
// 처음 hashmap으로 풀때 불필요없는게 포함돼서 하나만 있으면 좋겠다 싶었다. HashSet이라는 걸 처음 알게 되었다!
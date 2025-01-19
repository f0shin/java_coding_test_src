package programmers_basic.etc;

import java.util.HashMap;

public class SolutionLv2004_Unfinish {
	public static void main(String[] args) {
		int[] cards = { 8, 6, 3, 7, 2, 5, 1, 4};

		int result = solution(cards);
		System.out.println(result);

	}

	public static int solution(int[] cards) {
		// 게임 시작 전
		int answer = 0;
		int len1 = cards.length;

		HashMap<Integer, Integer> closedBoxs1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> openedBoxs1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> closedBoxs2 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> openedBoxs2 = new HashMap<Integer, Integer>();

		int currentBox = 0; // 현재박스
		int nextBox = 0; // 다음박스(=현재박스 안에 있는 카드번호)

		int turn1OpenBoxsCnt = 0; // 1턴 점수(1턴에서 연 박스 개수)
		int turn2OpenBoxsCnt = 0; // 2턴 점수(2턴에서 연 박스 개수)
		int score = 0; // 총 점수(1턴 종료+게임 종료시: 0점, 2턴 종료시: 1턴 점수*2턴 점수)
		int maxScore = 0; // 최고 점수

		boolean turn1Over = false; // t-1턴 종료, f-1턴 진행
		boolean turn2Over = false; // t-2턴 종료, f-2턴 진행
		boolean gameOver = false; // t-게임 종료, f-게임 진행
		boolean root1 = true; // t-root, f-node
		boolean root2 = true; // t-root, f-node

		// 게임 시작
		for (int i = 0; i < len1; i++) { // 박스 순서: 전체 박스 중 1 -> len1
			// 1턴 시작 전
			// 모든 상자 목록 clear
			closedBoxs1.clear(); // 초기화 설정이 필요함.
			closedBoxs2.clear();
			openedBoxs1.clear();
			openedBoxs2.clear();

			// closedBoxs1 초기화 설정
			for (int c = 0; c < len1; c++) {
				closedBoxs1.put((c + 1), cards[c]); // (박스 번호, 카드 번호)
			}

			// 모든 점수 초기화
			turn1OpenBoxsCnt = 0;
			score = 0;

			// 새로운 1턴 진행을 위해, 게임 상태 원상복구(종료 --> 진행)
			gameOver = false;
			turn1Over = false;
			root1 = true;

			// 1턴 시작
			while (turn1Over == false && gameOver == false) {
				// 1) 현재박스 설정
				if (root1) {
					currentBox = (i + 1); // 최초 현재박스 설정
					root1 = false; // root --> node 상태 변경
				} else {
					currentBox = nextBox; // 현재박스 설정 (이전 다음박스 번호)
				}

				// 2-1) 현재박스가 아직 열려있지 않다면 (closedBoxs 안에 있는 경우) --> 상자 열기 + 다음박스 설정 + 점수 증가
				if (closedBoxs1.containsKey(currentBox)) {
					nextBox = closedBoxs1.get(currentBox); // 다음박스 설정 (현재박스 안에 있는 카드의 번호)

					openedBoxs1.put(currentBox, nextBox); // 현재박스를 openedBoxs에 등록 (현재박스, 다음박스)
					closedBoxs1.remove(currentBox); // 현재박스를 closedBoxs에서 삭제

					turn1OpenBoxsCnt++; // 점수1 증가

					// 2-2) 현재박스가 이미 열려 있다면 (openedBoxs 안에 있는 경우) --> 1턴 종료
				} else {
					turn1Over = true; // 1턴 종료
				}
			} // while (1 turn)

			// 1턴 종료 이후 ~ 2턴 시작 or 게임 종료 전
			// 전부 열려있으면: 게임 종료, 점수: 0점 / 남아있으면 2턴으로
			int len2 = len1 - closedBoxs1.size();
			if (len2 == 0) { // 총 박스 개수 - closedBoxs1 개수 == 0?
				gameOver = true; // 비정상 게임 종료
				score = 0;
			} else {
				turn2Over = false;
			}

			if (!gameOver) {
				int[] closedBoxs2Temp = new int[len2]; // 2턴 순서 확인용
				int k = 0; // closedBoxs2Temp 인덱스
				
				// 2턴
				for (int j = 0; j < len2; j++) {
					// 2턴 시작 전(2번째 부터)
					if (j == 0) {
						// 2턴 시작 전(최초)

						for (int key : closedBoxs1.keySet()) {
							// 최초 closedBoxs2 초기화 설정 (closedBox1 남은 박스로)
							closedBoxs2.putAll(closedBoxs1);

							// 2턴 순서 설정 closedBoxs2Temp
							if (k < len2) {
								closedBoxs2Temp[k] = key;
								k++;
							}
						}
					} else { // j > 0
						// 2턴에서 사용하는 박스 clear 및 초기화 설정
						closedBoxs2.clear();
						closedBoxs2.putAll(openedBoxs2);
						openedBoxs2.clear();
					}

					// 2턴 점수 초기화
					turn2OpenBoxsCnt = 0;

					// 새로운 2턴 진행을 위해, 게임 상태 원상복구(종료 --> 진행)
					gameOver = false;
					turn2Over = false;
					root2 = true;  // 다음 j의 2턴을 위해, node --> root 상태 변경
					
					// 2턴 시작
					// 박스 순서: 남은 박스 중 closedBoxs2Temp[0 -> (len2 - 1)]
					while (turn2Over == false && gameOver == false) {
						// 1) 2턴의 현재박스 설정
						if (root2) {
							currentBox = closedBoxs2Temp[j]; // 2턴 최초 현재박스 설정
							root2 = false; // root --> node 상태 변경
						} else {
							currentBox = nextBox; // 현재박스 설정 (이전 다음박스 번호)
						}

						// 2-1) 현재박스가 아직 열려있지 않다면 (closedBoxs 안에 있는 경우) --> 상자 열기 + 다음박스 설정 + 점수 증가
						if (closedBoxs2.containsKey(currentBox)) {
							nextBox = closedBoxs2.get(currentBox); // 다음박스 설정 (현재박스 안에 있는 카드의 번호)

							openedBoxs2.put(currentBox, nextBox); // 현재박스를 openedBoxs에 등록 (현재박스, 다음박스)
							closedBoxs2.remove(currentBox); // 현재박스를 closedBoxs에서 삭제

							turn2OpenBoxsCnt++; // 점수1 증가

							// 2-2) 현재박스가 이미 열려 있다면 (openedBoxs 안에 있는 경우) --> 2턴 종료 = 게임 종료
						} else if (openedBoxs2.containsKey(currentBox)) {
							turn2Over = true; // 2턴 종료
							gameOver = true; // 게임 종료(정상)
							score = turn1OpenBoxsCnt * turn2OpenBoxsCnt; // 점수 계산
							maxScore = maxScore < score ? score : maxScore; // 최고 점수 계산
						}
					} // while (2 turn)
				} // for (j)
			} // if (!gameOver)
		} // for (i)

		answer = maxScore;
		return answer;
	}

}

// <혼자 놀기의 달인> (미완성)
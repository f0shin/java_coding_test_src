package bj_solution;

import java.io.*;

public class S10989_counting {
	
	// 수 정렬하기 3 - 계수 정렬
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rp = Integer.parseInt(br.readLine()); // 반복횟수: 1 ~ 10,000,000
		
		int[] cnt = new int[10000];

		for (int i = 0; i < rp ; i++) {
			int temp = Integer.parseInt(br.readLine()); // 입력값: 1 ~ 10000
			cnt[temp - 1]++;
		}
		
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < 10000 ; i++) {
			if (cnt[i] > 0) {
				for (int j = 0; j < cnt[i]; j++) {
					String result = String.valueOf(i + 1);
					bw.write(result + "\n");
				}
			}
		}
		
		bw.flush();
		bw.close();

	}

}

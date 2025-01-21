package bj_solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2566 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int maxIndexRow = 0;
		int maxIndexCol = 0;
		
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 9개
			for (int j = 0; j < 9; j++) {
				int temp = Integer.parseInt(st.nextToken());
				
				if (temp >= max) {
					max = temp;
					maxIndexRow = i + 1;
					maxIndexCol = j + 1;
				}
			}
		}
		
		br.close();
		
		System.out.println(max);
		System.out.println(maxIndexRow + " " + maxIndexCol);
		
	}
}

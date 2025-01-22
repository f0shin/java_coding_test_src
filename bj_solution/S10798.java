package bj_solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10798 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] temp = new String[5][15];
		
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			int t = 0;
			for (int j = 0; j < 15; j++) {
				if (t <= str.length() - 1) {
					temp[i][j] = str.split("")[j];
					t++;
				}
			}
		}
		br.close();
			
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (temp[j][i] != null) {
					System.out.print(temp[j][i]);
				}
			}
		}
	}
}

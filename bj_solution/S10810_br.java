package bj_solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S10810_br {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int rp = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[count];
		
		for (int i = 0; i < rp; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st2.nextToken());
			int end = Integer.parseInt(st2.nextToken());
			int ball = Integer.parseInt(st2.nextToken());
			
			for (int j = start - 1; j <= end - 1; j++) {
				basket[j] = ball;
			}
		}
		
		String str = "";
		
		for (int i = 0; i < count; i++) {
			str += basket[i] + " ";
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(str + "\n");
		
		br.close();
		bw.close();
		
	}
}

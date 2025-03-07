package bj_solution;

import java.io.*;
import java.util.PriorityQueue;

public class S2751_heap {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rp = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> hp = new PriorityQueue<Integer>();

		for (int i = 0; i < rp; i++) {
			hp.add(Integer.parseInt(br.readLine()));
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < rp; i++) {
			String s = String.valueOf(hp.poll());
			bw.write(s + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}

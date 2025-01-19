package bj_solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1152_fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String str = br.readLine().trim();
		String[] answer = str.split(" ");

		System.out.println(answer.length);
		
		br.close();
		
	}
}
// 아무것도 입력되지 않을때: 1로 출력됨
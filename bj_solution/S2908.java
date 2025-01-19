package bj_solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2908 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
//		String numA = st.nextToken();
//		String numB = st.nextToken();

//		int a = Integer.parseInt(numA.split("")[2] + numA.split("")[1] + numA.split("")[0]);
//		int b = Integer.parseInt(numB.split("")[2] + numB.split("")[1] + numB.split("")[0]);
		
		StringBuilder revA = new StringBuilder(st.nextToken()).reverse();
		StringBuilder revB = new StringBuilder(st.nextToken()).reverse();
		
		int a = Integer.parseInt(revA.toString());
		int b = Integer.parseInt(revB.toString());
		
		int max = a > b ? a : b;

		System.out.println(max);
		
		br.close();
		
	}
}

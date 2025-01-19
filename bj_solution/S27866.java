package bj_solution;

import java.io.IOException;
import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class S27866 {
	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine();
//		int i = Integer.parseInt(br.readLine()) - 1;
//		
//		br.close();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int i = sc.nextInt() - 1;
		
		sc.close();
		
		System.out.println(str.charAt(i));
		
	}
}

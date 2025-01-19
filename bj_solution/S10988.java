package bj_solution;

import java.util.Scanner;

public class S10988 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

        StringBuffer sb = new StringBuffer(str);
        String revStr = sb.reverse().toString();
        
        int answer = str.equals(revStr) ? 1 : 0;
        
        System.out.println(answer);
		
	}
}

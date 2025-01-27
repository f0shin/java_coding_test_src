package bj_solution;

import java.util.Scanner;

public class S11005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = sc.nextInt(); // b진법
        sc.close();
        
        String answer = "";
        
        while (!(num == 0)) {
            String temp = "";
            int n = num % b; // 나머지
            num = num / b; // 몫
            
            if (n > 9) {
                temp = String.valueOf((char)(n - 9 + 64));
            } else {
                temp = String.valueOf(n);
            }
            
            answer += temp;
            
            // System.out.println("num: " + num + ", n: " + n + ", answer: " + answer);
        }
        
        StringBuilder sb = new StringBuilder(answer);
        answer = (sb.reverse()).toString();
        
        System.out.println(answer);

	}
}

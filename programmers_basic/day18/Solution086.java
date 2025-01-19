package programmers_basic.day18;

public class Solution086 {
	public static void main(String[] args) {

		String myString = "xabcxdefxghi";

		int[] result = solution(myString);

		for (int i = 0; i < result.length; i++) {
			if (i == (result.length - 1)) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}

	}

	public static int[] solution(String myString) {
		
		if (myString.charAt(myString.length() - 1) == 'x') {
            myString = myString + " ";
        }

        String[] str = myString.split("x");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                answer[i] = 0;
            } else {
                answer[i] = str[i].length();
            }
        }

        return answer;
        
	}
}
// <x 사이의 개수>

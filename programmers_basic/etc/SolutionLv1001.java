package programmers_basic.etc;

public class SolutionLv1001 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 7, 6, 4};
		
		int result = solution(nums);

		System.out.print(result);

	}
	
	public static int solution(int[] nums) {

		int answer = 0;

		int len = nums.length;
		int numSum = 0;

		for (int i = 0; i < (len - 2); i++) {
			for (int j = (i + 1); j < (len - 1); j++) {
				for (int k = (j + 1); k < len; k++) {
					numSum = nums[i] + nums[j] + nums[k];
					
					int notPrime = 0;
					for (int n = 2; n < (numSum - 1); n++) {
						if (numSum % n == 0)
							notPrime++;
					} // n
					
					if (notPrime == 0)
						answer++;
				} // k
			} // j
		} // i

		return answer;
	}
}

// <소수 만들기>
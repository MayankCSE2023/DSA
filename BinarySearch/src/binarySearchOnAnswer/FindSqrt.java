package binarySearchOnAnswer;

/*You are given a positive integer ‘n’.

Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).


Example:
Input: ‘n’ = 7

Output: 2

Explanation:
The square root of the number 7 lies between 2 and 3, so the floor value is 2.*/

public class FindSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrtN(16));
	}

	public static int sqrtN(long N) {
		long low = 0;
		long high = N;
		long mid;
		long ans=0;

		while (low <= high) {
			mid = low + (high - low) / 2;

			if (mid * mid <= N) { //Note: Always use binary search when we know that till some point answer is valid and after that point the answer is not valid
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return (int)ans;
	}

}

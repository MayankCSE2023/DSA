package binarySearchOn1DArrays;

/*You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.

Implement the ‘upperBound’ function to find the index of the upper bound of 'x' in the array.

Note:
The upper bound in a sorted array is the index of the first value that is greater than a given value. 
If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
We are using 0-based indexing.
Try to write a solution that runs in log(n) time complexity.

Example:

Input : ‘arr’ = {2,4,6,7} and ‘x’ = 5,

Output: 2

Explanation: The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5 7
1 4 7 8 10


Sample Output 1:
3   */

public class UpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 3, 3, 4, 6, 7, 7 };
		System.out.println(upperBound(nums, 7, 0));

	}

	public static int upperBound(int[] arr, int n, int x) {
		// Write your code here
		int low = 0;
		int high = n - 1;
		int mid = 0;

		while (low <= high) {// {2,3,3,4,6,7,7}
			mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				if (mid + 1 == n || arr[mid + 1] > x) {
					return mid + 1;
				}
				low = mid + 1;
			} else if (arr[mid] > x) {
				if (mid - 1 < 0 || arr[mid - 1] < x) {
					return mid;
				}
				high = mid - 1;
			} else {
				if (mid + 1 == n || arr[mid + 1] > x) {
					return mid + 1;
				}
				low = mid + 1;
			}
		}

		return mid;
	}

}

package binarySearchOn1DArrays;

/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10*/

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 3, 7, 7, 10, 11, 11 };

		System.out.println(singleNonDuplicate(nums));

	}

	public static int singleNonDuplicate(int[] nums) {

		if (nums.length == 1) {
			return 0;
		}

		return search(nums, 0, nums.length - 1);
	}

	public static int search(int[] nums, int low, int high) {
		if (low >= high) {
			return -1;
		}

		int mid = low + (high - low) / 2;

		if ((mid == 0 && nums[mid + 1] != nums[mid]) || (mid == high && nums[mid] != nums[mid - 1])) {
			return nums[mid];
		} else if (nums[mid + 1] != nums[mid] && nums[mid - 1] != nums[mid]) {
			return nums[mid];
		}

		int leftResult = search(nums, low, mid - 1);
		int rightResult = search(nums, mid + 1, high);

		if (leftResult == -1 && rightResult == -1) {
			return -1; // Not found in this range
		} else {
			return leftResult != -1 ? leftResult : rightResult;
		}
	}

}

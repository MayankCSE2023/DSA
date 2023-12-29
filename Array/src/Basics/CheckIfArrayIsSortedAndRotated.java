package Basics;

public class CheckIfArrayIsSortedAndRotated {

	/*
	 * Given an array nums, return true if the array was originally sorted in
	 * non-decreasing order, then rotated some number of positions (including zero).
	 * Otherwise, return false. There may be duplicates in the original array.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [3,4,5,1,2] Output: true Explanation: [1,2,3,4,5] is the
	 * original sorted array. You can rotate the array by x = 3 positions to begin
	 * on the the element of value 3: [3,4,5,1,2].
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,4,3,2,1};
		System.out.println(check(nums));
	}
	
	//hint: count number of pivot and then move forward with the question

	public static boolean check(int[] nums) {

		int ind = 0;

		if (nums.length == 1 || nums.length == 2) {
			return true;
		}

		for (int i = 0; i < nums.length - 1; i++) {// nums = { 3, 4, 5, 1, 2 };
			if (nums[i] > nums[i + 1]) {
				ind = i;
				break;
			} else if (i == nums.length - 2) {
				return true;
			}
		}

		if (ind == 0 && nums[1] > nums[2]) {// 6,4,3,2,1
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] < nums[i + 1]) {
					return false;
				}
			}
		} else {

			for (int i = ind + 1; i < nums.length - 1; i++) {//3,1,2,2,4
				if (nums[i] > nums[i + 1] || nums[i+1] > nums[ind]) {
					return false;
				}
			}
		}
		return true;
	}

}

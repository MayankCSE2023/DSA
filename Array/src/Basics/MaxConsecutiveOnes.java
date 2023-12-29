package Basics;

/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
 The maximum number of consecutive 1s is 3.*/

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 0, 1, 1, 1 };

		System.out.println(findMaxConsecutiveOnes(nums));

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int maxCount = 0;

		for (int i = 0; i < nums.length; i++) {// nums= {1,1,0,1,1,1}
			if (nums[i] == 1) {
				count++;
				if (count > maxCount) {// keep updating max with each iteration
					maxCount = count;// max value will be remained at the end
				}
			} else {
				count = 0;
			}
		}

		return maxCount;
	}

}

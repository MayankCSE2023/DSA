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
		int[] nums = {3,2,1};
		System.out.println(check(nums));
	}
	
	//hint: count number of pivot and then move forward with the question

	public static boolean check(int[] nums) {

		if (nums.length == 1 || nums.length == 2) {
			return true;
		}
		
		int len=nums.length;
		int pivot=0;

		//case 1
		
		if(nums[0]<nums[len-1]) {
			for(int i=0;i<len-1;i++) {  
				if(nums[i]>nums[i+1]) {  // check if array is not rotated and in increasing order
					return false;
				}
			}
		}else {
			for(int i=0;i<len-1;i++) {  
				if(nums[i]>nums[i+1]) {  // check if array is rotated and only have 1 pivot
					pivot++;
				}
			}
			
			if(pivot>1) {
				return false;
			}
		}
		
		
		return true;
	}

}

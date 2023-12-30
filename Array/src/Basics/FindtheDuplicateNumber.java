package Basics;

import java.util.HashMap;

/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2                      */

public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 3, 4, 2, 4 };

		System.out.println(findDuplicate(nums));

	}

	public static int findDuplicate(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {// nums = [1,3,4,2,2]
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
                map.put(nums[i], 1);
			}
		}

		int dub = -1;

		for (int e : map.keySet()) {
			if (map.get(e) != 1) {
				dub = e;
				break;
			}
		}

		// -------------------N^2----------------------------//

//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				if(nums[i]-nums[j]==0) {
//					return nums[i];
//				}
//			}
//		}

		return dub;
	}

}

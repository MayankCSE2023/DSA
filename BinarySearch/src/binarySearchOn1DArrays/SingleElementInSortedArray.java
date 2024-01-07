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

		int low = 1;
		int high = nums.length - 2;
		int mid=-1;

		if (nums.length == 1) {
			return nums[0];
		}

		if (nums[low - 1] != nums[low]) {
			return nums[low - 1];
		} else if (nums[high] != nums[high + 1]) {
			return nums[high + 1];
		}

		while (low <= high) {//in binary search always look for ways to eliminate 1 side of the array

			mid = low + (high - low) / 2;//3, 3, 7, 7, 10, 11, 11

			if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
					return nums[mid];
			}
			
			if(mid%2==0) {
				if(nums[mid]==nums[mid+1]) {
					low=mid+1;
				}else {
					high=mid-1;
				}
			}else {
				if(nums[mid]==nums[mid-1]) {
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
		}
		return mid;
	}
}

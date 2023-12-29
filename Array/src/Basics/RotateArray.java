package Basics;

import java.util.ArrayList;

/*Given an integer array nums, rotate the array to the right by k steps,
 *  where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]*/

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4, 6, 7, 8 };
		rotate(nums, 4);

		for (int e : nums) {
			System.out.print(e+" ");
		}
	}

	public static void rotate(int[] nums, int k) {
		int l = nums.length;

		k = k % l;

		reverse(nums, 0, l - 1); // rotate whole array
		reverse(nums, 0, k - 1); // now rotate 1st k elements
		reverse(nums, k, l - 1); // then rotate last n-k elements

		// for(int i=0;i<k;i++){ --Not working for very large value of inputs
		// int num=nums[l-1];
		// for(int j=l-1;j>0;j--){
		// nums[j]=nums[j-1];
		// }
		// nums[0]=num;
		// }

	}

	public static void reverse(int[] nums, int s, int e) {
		if (s > e || s == e) {
			return;
		}

		int temp = nums[s];
		nums[s] = nums[e];
		nums[e] = temp;

		reverse(nums, s + 1, e - 1);
	}

}

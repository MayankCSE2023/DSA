package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/*18. 4Sum
Medium
Topics
Companies
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109*/

public class FourSome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2,2,2,2,2,2 };
		List<List<Integer>> sum4 = fourSum(nums, 8);

		System.out.println(sum4);

	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {

		Arrays.sort(nums);

		List<List<Integer>> sum4 = new ArrayList<>();

		int i = 0;
		int j = i + 1;
		int k = j + 1;
		int l = nums.length - 1;
		// List<List<Integer>> sum4=new ArrayList<>();

		int sum = 0;

		while (i < l) {
			while (j < l) {
				while (k < l) {
					sum = nums[i] + nums[j] + nums[k] + nums[l]; //{2,2,2,2,2,2}

					if (sum == target) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						list.add(nums[l]);
						sum4.add(list);
						k++;
						while(k<l && nums[k-1]==nums[k]) {
							k++;
						}
					} else if (sum > target) {
						l--;
					} else {
						k++;
					}
					sum = 0;
				}
				j++;
				l=nums.length-1;
				while(j<l && nums[j-1]==nums[j]) {
					j++;
				}
				k=j+1;
			}
			i++;
			l=nums.length-1;
			while(i<l && nums[i-1]==nums[i]) {
				i++;
			}
			j=i+1;
			k=j+1;
		}

//		List<List<Integer>> li = sum4.stream().map(innerSet -> new ArrayList<>(innerSet)) // Convert inner sets to
//																							// ArrayLists
//				.collect(Collectors.toList());

		return sum4;
	}

}

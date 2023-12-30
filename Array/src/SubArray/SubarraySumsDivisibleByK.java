package SubArray;

import java.util.Arrays;

//Given an integer array nums and an integer k,
//return the number of non-empty subarrays that have a sum divisible by k.
//A subarray is a contiguous part of an array.

public class SubarraySumsDivisibleByK {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 0, -2, -3, 1 };
		// System.out.println(subarraysDivByK(nums,5));
		System.out.println(sumArrSlidingWindow(nums, 5));

	}

	public static int subarraysDivByK(int[] nums, int k) {

		int n = sumArrSlidingWindow(nums, k);
		return n;
	}

//--------------------------By Sliding Window-----------------------------
	public static int sumArrSlidingWindow(int[] nums, int k) {
		int n = 0;
		int start = 0;
		int end = 0;
		int sum = 0;

		// Arrays.sort(nums);

		while (end < nums.length) {// int[] nums= {4,5,0,-2,-3,1};
			sum = sum + nums[end++];

			if (sum % k == 0) {
				n++;
			}

			while (start < end && (float) (sum / k) > 1.0) {// wrong logic
				sum = sum - nums[start++];

				if (sum % k == 0) {
					n++;
				}
			}
		}

		return n;
	}
}

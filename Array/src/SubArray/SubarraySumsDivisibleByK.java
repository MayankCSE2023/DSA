package SubArray;

import java.util.Arrays;
import java.util.HashMap;

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

		//int n = sumArrSlidingWindow(nums, k);
		int n = sumArrayPrefixSum(nums, k);
		return n;
	}
	
	//----------------------By Prefix sum with Hashing-------------------------
	public static int sumArrayPrefixSum(int[] nums, int k) {
		int count=0;
		int sum=0;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0, 1); //// Handle case when sum - k == 0
		
		for(int i=0;i<nums.length;i++) { //{-2,1,-3,4,-1,2,1,1,1,1}
			sum=sum+nums[i];
            int temp = (k != 0) ? sum % k : sum;// Calculates the remainder (temp) either as sum % k if k is not zero or simply as sum if k is zero. This temp represents the remainder after dividing the current sum by k
            if (temp < 0) temp += k;//If the remainder is negative, it adjusts it to be a positive remainder by adding k to it. This step is to handle negative remainders in Java, ensuring the remainder is always non-negative.
		   
		    if(map.containsKey(temp)) {
		    	count=count+map.get(temp);
		    }
		    
		 // Increment the frequency of the current sum in the map
	        map.put(temp, map.getOrDefault(temp, 0) + 1); //if no sum already present than it will be initialised with 0 and added 1
	        
		}
		return count;
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

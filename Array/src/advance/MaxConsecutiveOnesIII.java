package advance;


/*1004. Max Consecutive Ones III
Solved
Medium
Topics
Companies
Hint
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length*/


public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		
		System.out.println(longestOnes(nums, 3));

	}
	
	 public static int longestOnes(int[] nums, int k) {
	        int p = 0;
	        int q = 0;
	        int zero = 0;
	        int one = 0;
	        int max = 0;

	        while (q < nums.length) {
	            if (nums[q] == 0) {
	                zero++;
	            } else {
	                one++;
	            }

	            q++;

	            if (zero > k) {
	                if (q - p > max) {
	                    max = q - p - 1;
	                }

	                while (p < q && zero > k) {
	                    if (nums[p++] == 0) {
	                        zero--;
	                    }
	                }
	            }

	            if (q - p > max) {
	                max = q - p - 1;
	            }


	        }

	        if(zero<=k){ // last check when whole array is traversed
	            if (q - p > max) {
	                max = q - p;
	            }
	        }

	        return max;
	    }

}

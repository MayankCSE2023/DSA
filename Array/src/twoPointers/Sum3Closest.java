package twoPointers;

import java.util.Arrays;

/*16. 3Sum Closest

Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104*/

public class Sum3Closest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {-1,2,1,-4};
		System.out.println(threeSumClosest(num, 1));
	}
	
	public static int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;

        int j = 1;
        int k = nums.length - 1;
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {

            j = i + 1;
            k = nums.length - 1;

            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];

                if (temp == target) {
                    return temp;
                }

                if (Math.abs(temp - target) < min) {
                    sum = temp;
                    min = Math.abs(temp - target);
                }
                
                 if(temp>target){
                    k--;
                 }else{
                    j++;
                 }
               
            }

        }

        return sum;
    }

}

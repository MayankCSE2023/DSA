package Basics;

import java.util.HashMap;

/*Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
            2 is the missing number in the range since it does not appear in nums.*/

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {3,0,1};
			
			System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int reqSum=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){// TC- O(N) SC-O(1)
            sum=sum+nums[i];
            reqSum=reqSum+ (i+1);
        }


        return reqSum-sum;




//------------------TC- O(N)  SC- O(N)-----------------------------

        // 	int l=nums.length;
		// HashMap<Integer,Integer> map=new HashMap<>();
		
		// for(int i=0;i<=l;i++) {
		// 	map.put(i, 0);
		// }
		
		// for(int i=0;i<l;i++) {
		// 	if(map.containsKey(nums[i])) {
		// 		map.put(nums[i], 1);
		// 	}
		// }
		
		// for(int s: map.keySet()) {
		// 	if(map.get(s)==0) {
		// 		return s;
		// 	}
		// }
		// return -1;
	}

}

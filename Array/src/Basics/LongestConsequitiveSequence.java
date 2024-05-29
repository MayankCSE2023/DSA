package Basics;

import java.util.HashMap;

/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9*/

public class LongestConsequitiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsecutive(nums));

	}
	
	
	public static int longestConsecutive(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        int count=0;
        
        for(int e: map.keySet()){
            int cur=e;

            if(map.containsKey(cur-1)){//filter out unnecessary computation of
                continue;             //bigger elements in the sequence and
            }                           // move on whith smallest in potential sequence

            while(map.containsKey(cur++)){
                count++;
            }

            if(count>max){
                max=count;
            }

            count=0;
        }

    return max;
    }

}

package slidingWindow;

/*930. Binary Subarrays With Sum
Medium
Topics
Companies
Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15
 

Constraints:

1 <= nums.length <= 3 * 104
nums[i] is either 0 or 1.
0 <= goal <= nums.length*/

public class BinarySubarraysWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,0,0,0};
		System.out.println(numSubarraysWithSum(nums, 0));

	}
	
	 public static int numSubarraysWithSum(int[] nums, int goal) {
	        int low=1;
	        int high=nums.length;
	        int count=0;
	    

	        while(low<=high){
	            count=count+checkWindow(nums,goal,low);
	            low++;
	        }

	        return count;
	    }

	    public static int checkWindow(int[] nums, int goal, int window){
	        int low=0;
	        int high=window;
	        int sum=0;
	        int count=0;

	        while(high<=nums.length){
	            
	            sum=0;

	            for(int i=low;i<high;i++){
	                sum=sum+nums[i];
	            }

	            if(sum==goal){
	                count++;
	            }

	            low++;
	            high++;
	        }

	        return count;
	    }

}

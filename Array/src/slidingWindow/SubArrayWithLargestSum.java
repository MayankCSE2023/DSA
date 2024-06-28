package slidingWindow;

public class SubArrayWithLargestSum {
	
	//Given an integer array nums, find the subarray
	 //with the largest sum, and return its sum.

	//Example 1:

	//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
	//Output: 6
	//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));

	}
	
	public static int maxSubArray(int[] nums) {
		int sum=0,start=0,end=0,maxSum=Integer.MIN_VALUE;
		
		while(end<nums.length) {//nums = [-2,1,-3,4,-1,2,1,-5,4]
			sum=sum+nums[end++];
			if(sum>maxSum) {
				maxSum=sum;
			}
			
			while(end>start && sum<0) {
				sum=sum-nums[start++];
				
				if(sum>maxSum) {
					maxSum=sum;
				}			
			}
		}
		return maxSum;
	}
}

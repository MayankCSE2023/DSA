package binarySearchOnAnswer;

/*Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.*/

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,1,1,1};
		System.out.println(splitArray(nums, 5));

	}

	public static int splitArray(int[] nums, int k) {
		int largest = 0;
		int lowest = 0;
		int max = 0;
		int min=0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > lowest) {
				lowest = nums[i];
			}

			largest = largest + nums[i];
		}

		while (lowest <= largest) {//2,3,1,1,1,1,1
			int mid=lowest+(largest-lowest)/2;
			
			int sub=findSub(nums, mid);
			
			if(sub<=k) {
				min=mid;
				largest=mid-1;
			}else {
				lowest=mid+1;
			}
		}

		return min;
	}
	
	public static int findSub(int[] nums,int lowest) {
		int sum=0;
		int sub=1;
		
		for (int i = 0; i < nums.length; i++) {// {2,3,1,1,1,1,1}

			if (sum + nums[i] <= lowest) {
				sum += nums[i];
			} else {
				sub++;
				sum = nums[i];
			}
		}
		
		return sub;
	}
}

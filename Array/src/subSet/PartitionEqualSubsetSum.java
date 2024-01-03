package subSet;

/*Given an integer array nums, return true if you can partition
  the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

 
Example 1:

Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.*/

public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,5,11,5};
		System.out.println(canPartition(nums));

	}
	
	public static boolean canPartition(int[] nums) {
        long sum=0;
        for(int n: nums) {
        	sum=sum+n;
        }
        
        return checkPartition(nums,0,sum,0);

    }
	
	public static boolean checkPartition(int[] nums,int i,long sum,long currSum) {
		
		if(i>=nums.length) {
			if((sum-currSum)==currSum) {// if currSum is x then if remaining sum is K-x==x then it contains two equal sum partition
				return true;
			}
			
			return false;
		}
		
		return checkPartition(nums,i+1,sum,currSum+nums[i]) || checkPartition(nums,i+1,sum,currSum);
		
	}

}

package binarySearchOn1DArrays;

/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 *  If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1*/

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,3,5,9,12};// target = 9
		System.out.println(search(nums, 9));
		
	}
	
	 public static int search(int[] nums, int target) {
	        int n=nums.length;
	        int low=0;
	        int high=n-1;
	        int mid;
	        while(low<=high){
	            //mid= low + (high-low)/2;
	            mid=(high+low)/2;

	            if(nums[mid]==target){
	                return mid;
	            }else if(nums[mid]>target){
	                high=mid-1;
	            }else{
	                low=mid+1;
	            }
	        }
	        return -1;
	    }

}

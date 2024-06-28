package basic;

import java.util.PriorityQueue;

/*215. Kth Largest Element in an Array
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104*/

public class KthLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {3,2,3,1,2,4,5,5,6};
		System.out.println( findKthLargest(nums,4));

	}
	
	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(); /// by default min-heap
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int ans=0;

        k=nums.length-k+1;

        while(k!=0){
            ans=pq.poll();
            k--;
        }

        return ans;
        
    }
	

}

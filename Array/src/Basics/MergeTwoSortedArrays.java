package Basics;

import java.util.Arrays;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
 where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 
 Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		merge(nums1, 3, nums2, 3);
		
		for (int i : nums1) {
			System.out.print(i+" ");
		}

	}
	
	// Approach is start filling the largest number first from the last 
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		    int endM=m-1; // end of first array
	        int endN=n-1; // end of second array
	        int fill=m+n-1; // end of full length of the first array
	        
	        if(n==0){
	            return;
	        }

	        while(endM>=0 && endN>=0) {  //  nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	        	if(nums1[endM]<=nums2[endN]) {
	        		nums1[fill]= nums2[endN];  // [1,2,3,0,0,6] after first iteration
	        		endN--;
	        		fill--;
	        	}else if(nums1[endM]>nums2[endN]) {
	        		nums1[fill]= nums1[endM];
	        		endM--;
	        		fill--;
	        	}
	        }
	        
	        if(endM<0) {
	        	while(endN>=0) {
	        		nums1[fill]= nums2[endN];
	        		endN--;
	        		fill--;
	        	}
	        }else {
	        	nums1[fill]= nums1[endM];
	        	endM--;
        		fill--;
	        }
    }

}

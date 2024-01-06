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
		int[] nums1= {4,5,6,0,0,0};
		int[] nums2= {1,2,3};
		merge(nums1, 3, nums2, 3);
		
		for (int i : nums1) {
			System.out.print(i+" ");
		}

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		  int ptr1=0;
	        int ptr2=0;
	        int ptrN=m;
	        int l=m+n;
	        
	        if(n==0){
	            return;
	        }

	        for(int i=0,j=m-1;i<n;i++,j--){//nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	            if(nums1[j]<nums2[i]){
	                break;
	            }else{
	                int temp=nums1[j];
	                nums1[j]=nums2[i];
	                nums2[i]=temp;
	            }
	        }
	        
	        Arrays.sort(nums2);
	        Arrays.sort(nums1);
	        
	        
    }

}

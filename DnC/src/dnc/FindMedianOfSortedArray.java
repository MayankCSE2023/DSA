package dnc;




public class FindMedianOfSortedArray {
	
	/*4. Median of Two Sorted Arrays
Hard
Topics
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));

	}
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

	        int len = nums1.length + nums2.length;
	        int[] nums = new int[len];

	        int l = 0;
	        int m = 0;
	        int k = 0;

	        while (l < nums1.length && m < nums2.length) {
	            if (nums1[l] <= nums2[m]) {
	                nums[k] = nums1[l];
	                l++;
	            } else {
	                nums[k] = nums2[m];
	                m++;
	            }
	            k++;
	        }

	       
	            if (l == nums1.length) {
	                while(m<nums2.length) {
	                	nums[k]=nums2[m++];
	                	k++;
	                }
	            }else{
	            	while(l<nums1.length) {
	                	nums[k]=nums1[l++];
	                	k++;
	                }
	            }
	         

	        double median=-1;
	        int med=len/2;
	        System.out.println(med + " " + len);
	        
	        for(int e: nums) {
	        	System.out.print(e+" ");
	        }

	        if(len%2==0){
	            
	            median= (double)(nums[med-1]+nums[med])/2;
	        }else{
	            median= (double)nums[med];
	        }

	        return median;
	    }

}


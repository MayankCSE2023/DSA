package Basics;

import java.util.ArrayList;
import java.util.List;

/*You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]*/

public class RearrangeArrayElementsbySign {

	public static void main(String[] args) {

		int[] nums= {3,1,-2,-5,2,-4};
		int[] rearr=rearrangeArray(nums);
		
		for (int i : rearr) {
			System.out.print(i+" ");
		}
	}
	
	 public static int[] rearrangeArray(int[] nums) {
		// -----------------------Optimal Solution TC-O(N) SC-O(N)------------------/        
	        int l = nums.length;  
	        int pos = 0;
	        int neg = 1;

	        int[] rearr = new int[l];

	        for (int i = 0; i < rearr.length; i++) {
	            if (nums[i] > 0) {  //Note: here positive no. == negative no. then only 
	                rearr[pos] = nums[i];//optimal works if not this case only brute
	                pos = pos + 2;//force will works
	            } else {
	                rearr[neg] = nums[i];
	                neg = neg + 2;
	            }
	        }
	        return rearr;
	        
	        
	        
	        
	        
	        
	        
	        
	//---------------------------Brute Force TC-O(N^2) SC-O(N)----------------------//         
	   
//	        List<Integer> positive=new ArrayList<>(l/2);
//	        List<Integer> negative=new ArrayList<>(l/2);
//
//	        for(int i=0;i<l;i++){
//	            if(nums[i]>0){
//	                positive.add(nums[i]);
//	            }else{
//	                negative.add(nums[i]);
//	            }
//	        }
//
//	        for(int i=0;i<l;i++){
//	            if(i%2==0){
//	                nums[i]=positive.remove(0);
//	            }else{
//	                nums[i]=negative.remove(0);
//	            }
//	        }
//	        return nums;
	    }

}

package SubArray;

public class MaximumProductSubarray {

//Given an integer array nums, find a subarray that has the largest product, and return the product.
//The test cases are generated so that the answer will fit in a 32-bit integer.

//	Example 1:

	// Input: nums = [2,3,-2,4]
	// Output: 6
	// Explanation: [2,3] has the largest product 6.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, -5, -2, -4, 3 };
		System.out.println(maxProduct(nums));

	}

	public static int maxProduct(int[] nums) {
	int maxProduct = nums[0];
	int prefix=1,suffix=1;
	int n=nums.length;
	
	for(int i=0;i<n;i++) {
		prefix=prefix*nums[i];
		suffix*=nums[n-i-1];
		
		if(prefix>maxProduct) {
			maxProduct=prefix;
		}
		
		if(suffix>maxProduct) {
			maxProduct=suffix;
		}
		
		if(prefix==0) {
			prefix=1;
		}
		
		if(suffix==0) {
			suffix=1;
		}
	}
	
	return maxProduct;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//-------------------------------------------------------------------------------//			

//	public static int maxProduct(int[] nums) {
//		int maxProduct = nums[0];
//		int product = 1;
//		int end = 0;
//
//		while (end < nums.length) {// [2,3,-2,4]
//			product = product * nums[end++];
//
//			if (product > maxProduct) {
//				maxProduct = product;
//			}

//			
//
//			if (product <= 0) {// streak terminating condition
//				int ptr = end;
//				boolean flag = false;
//				while (ptr < nums.length) {
//					product = product * nums[ptr++];
//					if (product > 0) {
//						flag = true;
//						maxProduct = product;
//						end = ptr;
//						break;
//					
//					}
//				}
//				if (flag == false) {
//					product = 1;
//				}
//			}
//
//		}
//
//		return maxProduct;
//	}

}

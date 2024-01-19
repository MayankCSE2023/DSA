package advance;

/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-1,1,0,-3,3};
		productExceptSelf(nums);
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] productExceptSelf(int[] nums) {

        int[] prefix=new int[nums.length];
        int[] postfix=new int[nums.length];
        int mul=1;

        for(int i=0;i<nums.length;i++){
            if(i==0){
                prefix[i]=1;
                continue;
            }

            prefix[i]=prefix[i-1]*nums[i-1];
        }

        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                postfix[i]=1;
                continue;
            }

            postfix[i]=postfix[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){

            nums[i]=prefix[i]*postfix[i];
        }

        
    return nums;
    }

}

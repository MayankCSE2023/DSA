package bitmanipulation;

/*Given a non-empty array of integers nums, every element appears twice except for one.
 *  Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4*/

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));

	}
	
	public static int singleNumber(int[] nums) {
        // this question can easily be done by HashMap

        int xor=0;

        for(int i=0;i<nums.length;i++){
            xor=xor ^ nums[i];//a^a=0 therefore dublicates will cancel out each other
        }

        return xor;
    }

}

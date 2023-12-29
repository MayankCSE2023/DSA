package Basics;

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] nums = {0,3,0,1,0,3,12,0};
           moveZeroes(nums);
           
           for (int e : nums) {
   			System.out.print(e+" ");
   		}
	}
	
    public static void moveZeroes(int[] nums) {
        
        int n=nums.length;
        int zero=0;
        int nonZero=0;

        while(nonZero<n){       //-------N TC
            if(nums[zero]==0){
                if(nums[nonZero]==0){
                    nonZero++;
                    continue;
                }
                
                int temp=nums[nonZero];
                nums[nonZero]=nums[zero];
                nums[zero]=temp;
                zero++;
            }else{
                zero++;
                nonZero++;
            }
            
        }
        // for(int i=0;i<n;){ //-------N^2 TC
            
        //     if(nums[i]==0){
        //         for(int j=i;j<nonZero;j++)
        //         {
        //             nums[j]=nums[j+1];
        //         }
        //             nums[nonZero]=0;
        //             nonZero--;
        //             n--;
        //     }else{
        //         i++;
        //     }
        // }


    }

}

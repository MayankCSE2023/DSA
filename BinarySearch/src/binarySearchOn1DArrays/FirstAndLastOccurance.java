package binarySearchOn1DArrays;

/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]*/

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,7,7,8,8,10};
		int[] out=searchRange(nums, 8);
		

        for(int i=0;i<out.length;i++){
             System.out.print(out[i]+" ");
        }
		
	}
	
	public static int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length;
        int mid=-1;

        int[] out=new int[2];

        for(int i=0;i<out.length;i++){
            out[i]=-1;
        }

        if(nums.length==0){
            return out;
        }

        out[0]=firstOccurance(nums,target);
        out[1]=lastOccurance(nums,target);

        return out;
    }

    public static int firstOccurance(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int mid=-1;

        while(low<=high){

            mid=low+(high-low)/2;

            if(nums[mid]==target){
                if( mid-1==-1 || nums[mid-1]!=target){
                    return mid;
                }else{
                    high=mid-1;
                }
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return -1;
    }

    public static int lastOccurance(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int mid=-1;

        while(low<=high){

            mid=low+(high-low)/2;

            if(nums[mid]==target){
                if( mid+1==nums.length || nums[mid+1]!=target){
                    return mid;
                }else{
                    low=mid+1;
                }
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return -1;
    }

}

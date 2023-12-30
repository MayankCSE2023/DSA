package subSequence;

import java.util.Arrays;

//Given an integer array nums and an integer k,
//return the number of non-empty subarrays that have a sum divisible by k.
//A subarray is a contiguous part of an array.

public class SubarraySumsDivisibleByK {

	public static void main(String[] args) {
		
		int[] nums= {4,5,0,-2,-3,1};
		System.out.println(subSequenceDivByK(nums,5));

	}

	
public static int subSequenceDivByK(int[] nums, int k) {
        
        int n=subSequence(nums,k,0,0,0);
        return n;
    }


//--------------------------By Recursion-----------------------------------
    public static int subSequence(int[] nums, int k,int i,int n,int sum){ 
        if(i>=nums.length){
            if(sum!=0 && sum%k==0){// sum can be zero too therefore it has bug
                n++;
            }
            return n;
        }
        
        n=subSequence(nums,k,i+1,n,sum+nums[i]);//int[] nums= {4,5,0,-2,-3,1};
        return subSequence(nums,k,i+1,n,sum);
    }

}

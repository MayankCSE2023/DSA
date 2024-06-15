package subSet;

import java.util.ArrayList;
import java.util.List;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5};
		int n=14;
		System.out.println(findSubsequence(nums, 0, 0, n, 0, false));

	}

	
	//--------------------check subSequence------------------------------//
	public static boolean findSubsequence(int[] nums,int i,int sum,int n,int count,boolean status){
		
		 if(status == true) { // prevent unnecessary recursion calls
	        	return status;
	        }
		 
        if(i>=nums.length){ //{1,2,1,2}
            if(sum%n==0 && count<nums.length && count!=0) {
            	return true;
            }
            return false;
        }

        
        status=findSubsequence(nums,i+1,sum+nums[i],n,count+1, status);
        return findSubsequence(nums,i+1,sum,n,count,status);
    }

}

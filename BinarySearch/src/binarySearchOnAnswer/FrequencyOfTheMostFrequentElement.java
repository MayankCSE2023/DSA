package binarySearchOnAnswer;

import java.util.Arrays;

/*The frequency of an element is the number of times it occurs in an array.

You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

Return the maximum possible frequency of an element after performing at most k operations.

 

Example 1:

Input: nums = [1,2,4], k = 5
Output: 3
Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
4 has a frequency of 3.
Example 2:

Input: nums = [1,4,8,13], k = 5
Output: 2
Explanation: There are multiple optimal solutions:
- Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
- Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
- Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
Example 3:

Input: nums = [3,9,6], k = 2
Output: 1
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
1 <= k <= 105*/

public class FrequencyOfTheMostFrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {7,4,8,13};
		System.out.println(maxFrequency(nums, 5));

	}
	
public static int maxFrequency(int[] nums, int k) {
        
        Arrays.sort(nums);
        int high=nums.length;
        int low=1;
        int ans=1;

        while(low<=high){
            int mid= low+(high-low)/2;

            if(ifPossible(nums,mid,k)==true){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return ans;
    }

    public static boolean ifPossible(int[] nums, int window,int k){
        int i=0;
        int j=window-1;

        while(j<nums.length){
            int n=j-1;
            long op=0;

            while(n!=i-1){
                op=op+(long)nums[j]-(long)nums[n];
                if(op>(long)k){
                    break;
                }
                n--;
            }

            if(op<=(long)k){
                return true;
            }

            i++;
            j++;

        }

        return false;
    }

}

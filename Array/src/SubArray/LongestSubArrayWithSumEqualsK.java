package SubArray;

import java.util.HashMap;

public class LongestSubArrayWithSumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,1,2,3,4,2,1,2,1,2,1,3,4,5,1,1,1,3};
		int[] nums2= {1,1,-1,3,3,-1,3,1,3,1,-1,1,1,1,1,3};
		
	    System.out.println(findSubarray(nums1, 3));
		System.out.println(findSubarrayHashMap(nums2,4));

	}
	
//------------------------HashMap(Only works for positive and zeros)-------------------------------------------//
	//Take the sum as key and index at value
	public static int findSubarrayHashMap(int[] nums,int k) {
		int max=0;
		int sum=0,diff=0;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		
		for(int i=0;i<nums.length;i++) {//{1,1,2,3,4,2,1,1,0,0,0,0,0,1,2,1,2,1,3,4,5,1,1,3}
			sum=sum+nums[i];
			
			if(sum==k) {
				max=i+1;// as all are positive therefore max will the current iteration from 0
				map.put(sum,i);
			}
			
			if(map.containsKey(sum-k)) {
				diff=i-map.get(sum-k);//sum-k---currrent index- length already present
				
				if(diff>max) {
					max=diff;
				}
			}
			
			map.putIfAbsent(sum, i);// for 0, if a key already present don't update the key as we want the longest length of subarray
		}
		
		return max;
	}	
	
//------------------------Sliding Window(Work for positive and negative both)-----------------------------------//	
	public static int findSubarray(int[] nums,int k) {
		int max=0;
		int start=0,end=0;
		int sum=0;
		int diff=0;
		
		
		while(end!=nums.length) {//{1,1,2,3,4,2,1,1,1,2,1,2,1,3,4,5,1,1,3}
			sum=sum+nums[end++];
			
			if(sum==k) {
				diff=end-start;
				if(diff>max) {
					max=diff;
				}
			}
			
			while(start<end && sum>k) {
				sum=sum-nums[start++];
				
				if(sum==k) {
					diff=end-start;
					if(diff>max) {
						max=diff;
					}
				}
			}
		}
		return max;
	}

}

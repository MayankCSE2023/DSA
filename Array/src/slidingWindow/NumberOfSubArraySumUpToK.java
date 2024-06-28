package slidingWindow;

import java.util.HashMap;

public class NumberOfSubArraySumUpToK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {-2,1,-3,4,-1,2,1,1,1,1};
		System.out.println(subArraySumBrute(nums,4));
		System.out.println(subArraySumHashing(nums,4));
		System.out.println(subArrayTwoPointers(nums,4));

	}
	
	//----------Brute Force TC-O(N^2)-------------------------//
	public static int subArraySumBrute(int[] nums,int k) {
		int count=0;
		int sum=0;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i;j<nums.length;j++) {
				sum=sum+nums[j];
				if(sum==k) {
					count++;
				}
			}
			sum=0;
		}
		
		
		return count;
	}
	
	//-------------------Prefix sum using hashing--------------------------
	
	public static int subArraySumHashing(int[] nums,int k) {
		int count=0;
		int sum=0;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0, 1); //// Handle case when sum - k == 0
		
		for(int i=0;i<nums.length;i++) { //{-2,1,-3,4,-1,2,1,1,1,1}
			sum=sum+nums[i];
		   
		    if(map.containsKey(sum-k)) {
		    	count=count+map.get(sum-k);
		    }
		    
		 // Increment the frequency of the current sum in the map
	        map.put(sum, map.getOrDefault(sum, 0) + 1); //if no sum already present than it will be initialised with 0 and added 1
	        
		}
		return count;
	}
	
	//----------Two Pointers TC-O(N)-------------------------//
	
		public static int subArrayTwoPointers(int[] nums,int k) {
			int count=0;
			int sum=0,start=0,end=0;
			
			while(end<nums.length) {
				sum=sum+nums[end++];
				
				if(sum==k) {
					count++;
				}
				
				while(end>start && (sum>k || sum<0)) {//nums= {-1,-1,1} k=0
					sum=sum-nums[start++];
					if(sum==k) {
						count++;
					}
				}
			}
			return count;
		}

}

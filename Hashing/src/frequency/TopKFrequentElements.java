package frequency;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*Given an integer array nums and an integer k, return the k most frequent elements.
 *  You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]*/

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int[] arr = topKFrequent(nums, 2);

	}

	public static int[] topKFrequent(int[] nums, int k) {
		int[] arr = new int[k];

		HashMap<Integer, Integer> map = new HashMap<>();
		int pre = nums[0];
		int count = 0;

		for (int i = 0; i < nums.length;) {// nums= {1,1,1,2,2,3};
			
			if (nums[i] != pre) {
				map.put(count, nums[i - 1]);
				count = 0;
				pre = nums[i];
				continue;
			}
			
			count++;
			i++;
		}
		
		map.put(count, nums[nums.length - 1]);
		
		System.out.println(map);
		int[] arry=new int[map.size()];
		Set<Integer> s=map.keySet();
		int i=0;
	      for(int e: s) {
	    	  arry[i]=e;
	    	  i++;
	      }
	      
	     Array.s

		return arr;

	}

}

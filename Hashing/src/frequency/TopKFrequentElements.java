package frequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
		int[] nums = { 1, 1, 1, 2, 2, 3};
		int[] arr = topKFrequent(nums, 2);
		printArray(arr);
		

	}

	public static int[] topKFrequent(int[] nums, int k) {// HashMap and bucket sort
		
		int[] arr = new int[k];
		List<Integer>[] bucket= new List[nums.length+1];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) { // create a hash table
			if(map.containsKey(nums[i])) {
				int fre=map.get(nums[i])+1;
				map.put(nums[i],fre);
				
			}else {
				map.put(nums[i],1);
			}
		}
		
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			
			int frequency= e.getValue();
			
			if(bucket[frequency]==null) {
				bucket[frequency]=new ArrayList<>();
				bucket[frequency].add(e.getKey());
			}else {
				bucket[frequency].add(e.getKey());
			}
		}
		
		int count=0;
		
		for(int i=bucket.length-1;i>=0 && count<k;i--) {
			if(bucket[i]!=null) {
				for(Integer e: bucket[i]) {
					arr[count++]= e;
				}
			}
		}
		return arr;

	}
	
	public static void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}

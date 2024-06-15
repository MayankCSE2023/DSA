package Basics;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and 
smallest positive missing number is 2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer ( The first index contains B and second index contains A.)

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ N ≤ 105
1 ≤ Arr[i] ≤ N*/

public class FindMissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,3};
		int[] output= new int[2];
		output=findTwoElement(nums, 4);
		
		for(int e:output) {
			System.out.print(e+" ");
		}
	}

	public static int[] findTwoElement(int[] nums, int n) {
		int[] output = new int[2];
		int missing=0;
		int dublicate=0;
		int sum=0;
		int sumA=0;
		
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
			
			sum=sum+i+1;
			sumA=sumA+nums[i];
		}
		
		for(int e:map.keySet()) {
			if(map.get(e)>1) {
				dublicate=e;
				break;
			}
		}
		
		System.out.println(sumA +" "+ sum);
		
		missing= dublicate - (sumA - sum);
		
		output[0]=dublicate;
		output[1]=missing;

		return output;

	}

}

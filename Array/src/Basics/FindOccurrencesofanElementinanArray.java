package Basics;

import java.util.ArrayList;

/*3159. Find Occurrences of an Element in an Array
Solved
Medium
Topics
Companies
Hint
You are given an integer array nums, an integer array queries, and an integer x.

For each queries[i], you need to find the index of the queries[i]th occurrence of x in the nums array. If there are fewer than queries[i] occurrences of x, the answer should be -1 for that query.

Return an integer array answer containing the answers to all queries.

 

Example 1:

Input: nums = [1,3,1,7], queries = [1,3,2,4], x = 1

Output: [0,-1,2,-1]

Explanation:

For the 1st query, the first occurrence of 1 is at index 0.
For the 2nd query, there are only two occurrences of 1 in nums, so the answer is -1.
For the 3rd query, the second occurrence of 1 is at index 2.
For the 4th query, there are only two occurrences of 1 in nums, so the answer is -1.
Example 2:

Input: nums = [1,2,3], queries = [10], x = 5

Output: [-1]

Explanation:

For the 1st query, 5 doesn't exist in nums, so the answer is -1.
 

Constraints:

1 <= nums.length, queries.length <= 105
1 <= queries[i] <= 105
1 <= nums[i], x <= 104*/

public class FindOccurrencesofanElementinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		int[] nums = {1,3,1,7};
		int[]queries = {1,3,2,4};
		
		int[] answer=occurrencesOfElement(nums,queries,1);
		for(int i:answer) {
			System.out.print(i+" ");
		}

	}
	
	 public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
	        
	        ArrayList<Integer> list= new ArrayList<>(); // create a arraylist to store each occurance index
	        int[] answer= new int[queries.length]; //  to store answer

	        for(int i=0;i<nums.length;i++){ 
	            if(nums[i]==x){
	                list.add(i); // add each index where x is present
	            }
	        }

	        for(int i=0;i<queries.length;i++){
	            if(queries[i]>list.size()){ // if no. of query is  more then occurance then -1
	                answer[i]=-1;
	                continue;
	            }

	            answer[i]=list.get(queries[i]-1); //get occurence position from array list
	        }

	        return answer;
	    }

}

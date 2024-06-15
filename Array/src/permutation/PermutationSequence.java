package permutation;

/*60. Permutation Sequence
Hard
Topics
Companies
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

 

Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
Example 3:

Input: n = 3, k = 1
Output: "123"
 

Constraints:

1 <= n <= 9
1 <= k <= n!*/

public class PermutationSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getPermutation(4, 9)); //"2314"

	}

	public static String getPermutation(int n, int k) {

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i]=i+1;
		}
		
		int ind=-1;
		
		for(int i=0;i<k;i++) { //"1234"
			
			for(int j=n-2;j>=0;j--) {
				if(nums[j]<nums[j+1]) {
					ind=j;
					break;
				}
			}
			
			if(ind == -1) {
				sort(nums,0,n-1);
				continue;
			}
			
			for(int j=n-1;j>ind;j--) {
				if(nums[j]>nums[ind]) {
					int temp=nums[ind];
					nums[ind]=nums[j];
					nums[j]=temp;
					break;
				}
			}
			
			sort(nums,ind+1,n-1);
			
			print(nums);
			
		}
		
		StringBuilder sb = new StringBuilder();
	    for (int num : nums) {
	        sb.append(num);
	    }
	    
	    
	    return sb.toString();
			
	}

	private static void print(int[] nums) {
		for(int n:nums) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
	}

	private static void sort(int[] nums, int i, int j) {
		while(j>i) {
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			j--;
			i++;
		}
	}

}

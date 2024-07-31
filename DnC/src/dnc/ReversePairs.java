package dnc;

/*493. Reverse Pairs
Solved
Hard
Topics
Companies
Hint
Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
 

Constraints:

1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1*/

public class ReversePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3,2,3,1};
		
		for(int e:nums) {
			System.out.print(e+" ");
		}

	}
	
	public int reversePairs(int[] nums) {

        int count = 0;
        count = mergeSort(nums, 0, nums.length - 1);

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if ((long) nums[i] > (long) nums[j] * 2) {
        // count++;
        // }
        // }
        // }

        return count;
    }

    public static int mergeSort(int[] nums, int low, int high) {
        int reverse = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;

            reverse += mergeSort(nums, low, mid);
            reverse += mergeSort(nums, mid + 1, high);
            reverse += merge(nums, low, mid, high);
        }

        return reverse;
    }

    private static int merge(int[] nums, int low, int mid, int high) {
        // TODO Auto-generated method stub

        int i = mid;
        int j = mid + 1;
        int reverse = 0;
        int k = 0;

        while (j <= high) {
            i = mid;

            // while (i >= low && (long)nums[i] > (long)2 * nums[j]) { // iterate backwards
            // in left half
            // reverse++;
            // i--;
            // }
            while (i >= low) {
                if ((long) nums[i] <= (long) 2 * nums[j]) {
                    break;
                }
                reverse++;
                i--;
            }

            j++;
        }

        i = low;
        j = mid + 1;

        int[] aux = new int[high - low + 1];

        while (i < mid + 1 && j <= high) {
            if (nums[i] <= nums[j]) {
                aux[k++] = nums[i++];
            } else {
                aux[k++] = nums[j++];
            }
        }

        if (i >= mid + 1) {
            while (j <= high) {
                aux[k++] = nums[j++];
            }
        } else {
            while (i < mid + 1) {
                aux[k++] = nums[i++];
            }
        }

        k = 0;
        while (low <= high) {
            nums[low++] = aux[k++];
        }

        return reverse;
    }

}

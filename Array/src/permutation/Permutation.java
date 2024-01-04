package permutation;

import java.util.ArrayList;
import java.util.List;

/*Given an array nums of distinct integers, return all the possible permutations. 
 * You can return the answer in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]*/

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,2,3,4,5};
		List<List<Integer>> allPer=permute(nums);
		
		for (List<Integer> per: allPer) {
			System.out.println(per);
		}

	}
	
	public static List<List<Integer>> permute(int[] nums) {
        int l = nums.length;
        int fact = 1;

        for (int i = 1; i <= l; i++) { //find out total permutation possible
            fact *= i;
        }

        List<List<Integer>> allPer = new ArrayList<>(); // list of all permutation

        while (fact != 0) {// will run for each permutation

            int ind = -1;

            for (int i = l - 2; i >= 0; i--) {// [1,2,3]
                if (nums[i] < nums[i + 1]) { // find the dip i.e at index 1
                    ind = i;                 // with dp we try to find next largest number
                    break;
                }
            }

            if (ind == -1) {// if no dip means array is at the last permutation 
                sort(nums, 0, l - 1);//reverse whole array
                List<Integer> per = convert(nums);
                
                allPer.add(per);
                fact--;
                continue;
            }

            for (int i = l - 1; i >= 0; i--) {
                if (nums[i] > nums[ind]) { // swap the next largest number w.r.t ind index element
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
                }
            }

            sort(nums, ind + 1, l - 1);
            List<Integer> per = convert(nums);
            allPer.add(per);
            fact--;
        }

        return allPer;
    }

    public static void sort(int[] nums, int s, int e) {
        if (s >= e) {
            return;
        }

        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
        sort(nums, s + 1, e - 1);
    }

    public static List<Integer> convert(int[] nums) {
        List<Integer> per = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            per.add(nums[i]);
        }

        return per;
    }

}

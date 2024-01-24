package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30*/

public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candidates = {10,1,2,7,6,1,5};
		List<List<Integer>> allSet=combinationSum2(candidates, 8);
		
		for (List<Integer> list : allSet) {
			System.out.println(list);
		}

	}//-----------------------TLE----------------------------------
	
	 public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

	        HashSet<List<Integer>> allSet = new HashSet<>();
	        allCombinations(candidates, target, 0, 0, new ArrayList<>(), allSet);
	        List<List<Integer>> allset = new LinkedList<>(allSet);
	        return allset;
	    }

	    public static void allCombinations(int[] candidates, int target, int sum, int i, List<Integer> set,
	            HashSet<List<Integer>> allSet) {

	        if (i == candidates.length) {
	            if (sum == target) {
	                List<Integer> s = new ArrayList(set);
	                Collections.sort(s);
	                allSet.add(new ArrayList(s));
	            }
	            return;
	        }

	        if (sum == target) {
	            List<Integer> s = new ArrayList(set);
	            Collections.sort(s);
	            allSet.add(new ArrayList(s));
	            return;
	        }

	        set.add(candidates[i]);
	        allCombinations(candidates, target, sum + candidates[i], i + 1, set, allSet);
	        set.remove(set.size() - 1);
	        allCombinations(candidates, target, sum, i + 1, set, allSet);
	    }

}

package advance;

import java.util.ArrayList;
import java.util.List;

/*Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []*/

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates= {2,3,5};
		List<List<Integer>> allList= combinationSum(candidates,8);
		
		for (List<Integer> list : allList) {
			System.out.println(list);
		}
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allList=new ArrayList<>();
        sumList(candidates,0,target,0,allList,new ArrayList());
            return allList;
    }

    public static void sumList(int[] candidates,int i, int target,int sum,List<List<Integer>> allList,List<Integer> list){
        if(i>=candidates.length || sum>target){
            return;
        }

        if(sum==target){
            allList.add(new ArrayList(list));
            return;
        }

        list.add(candidates[i]);
        sumList(candidates,i,target,sum+candidates[i],allList,list);// 2,3,5    8
        list.remove(list.size()-1);
        sumList(candidates,i+1,target,sum,allList,list);
    }

}

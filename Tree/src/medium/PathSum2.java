package medium;

import java.util.ArrayList;
import java.util.List;

/*Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

 

Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: []
Example 3:

Input: root = [1,2], targetSum = 0
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000*/

public class PathSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        int sum=0;
	        List<Integer> list=new ArrayList<>();
	        List<List<Integer>> allPath=new ArrayList<>();

	        path(root,allPath,list,sum,targetSum);
	        return allPath;
	    }

	        public static void path(TreeNode root,List<List<Integer>> allPath,List<Integer> list,int sum,int targetSum){

	             if(root==null){
	                 return;
	             }

	             sum=sum+root.val;
	             list.add(root.val);

	             if(root.left==null && root.right==null && sum==targetSum){
	                 allPath.add(new ArrayList<>(list));
	                 list.remove(list.size()-1);// when path is found then it is essential to remove it as we are going back to find a differnet path.
	                 return;
	             }

	             path(root.left,allPath,list,sum,targetSum);
	             path(root.right,allPath,list,sum,targetSum);
	             list.remove(list.size()-1);
	        }

}

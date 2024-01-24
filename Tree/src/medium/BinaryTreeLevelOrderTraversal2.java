package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[15,7],[9,20],[3]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000*/

public class BinaryTreeLevelOrderTraversal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> tree= new ArrayList<>();
        List<Integer> level= new ArrayList<>();

        if(root==null){
            return tree;
        }

        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            level.add(curr.val);

            if(curr.left!=null){
                q.add(curr.left);
            }

            if(curr.right!=null){
                q.add(curr.right);
            }

            if(q.peek()==null){
                tree.add(level);
                level=new ArrayList<>();
                q.remove();

                if(q.isEmpty()){
                    break;
                }

                q.add(null);
            }
        }
        
        List<List<Integer>> reverse= new ArrayList<>();

        for(int i= tree.size()-1; i>=0; i--){
            reverse.add(tree.get(i));
        }
        
        return reverse;
    }

}

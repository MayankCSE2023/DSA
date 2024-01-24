package easy;

import java.util.LinkedList;
import java.util.Queue;

/*Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
 

Constraints:

The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000*/

public class MinimumDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int dept=0;

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr=q.poll();

            if(curr!=null){
                
                if(curr.left==null && curr.right==null){
                    dept++;
                    break;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }else{
                dept++;
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
return dept;
    }

}

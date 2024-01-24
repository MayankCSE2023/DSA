package easy;

/*Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
 

Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
 

Follow up: Could you solve it both recursively and iteratively?*/


  //Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }

        return isSame(root.left, root.right);
        
    }

    public boolean isSame(TreeNode p, TreeNode q){

        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        return (p.val == q.val) && isSame(p.left,q.right) && isSame(p.right,q.left);
    }

}

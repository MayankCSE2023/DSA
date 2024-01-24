package medium;

/*Given a binary tree, determine if it is 
height-balanced
.

 Height-Balanced
A height-balanced binary tree is a binary tree in which the depth of the two subtrees 
of every node never differs by more than one.

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true
 

Constraints:

The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104*/

class BooleanWrapper {
    private boolean value;

    public BooleanWrapper(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isBalanced(TreeNode root) {

        if(root==null){
            return true;
        }

        if(root.left==null && root.right==null){
            return true;
        }

        BooleanWrapper status=new BooleanWrapper(true);
        
        checkHeight(root,status);
        return status.getValue();
    }

    public static int checkHeight(TreeNode root,BooleanWrapper status){
         
          if(root==null || status.getValue()==false){
            return 0;
        }

            int left=checkHeight(root.left,status);
            int right=checkHeight(root.right,status);
            int height=left-right;
        
            if(height<-1 || height>1){
               status.setValue(false);
            }

            return 1 + Math.max(left, right);
        }

}

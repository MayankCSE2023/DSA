package traversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        list.add(root.val);
         preorderTraversal(root.left);
         preorderTraversal(root.right);  // we cant have 2 return value in 1 block
       return list;
    }

}

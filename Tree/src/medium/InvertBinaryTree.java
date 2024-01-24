package medium;

public class InvertBinaryTree {

	public static void main(String[] args) {
		//TODO Auto-generated method stub

	}
	
	public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return null;
        }
        
        if(root.left==null && root.right==null){
            return root;
        }

        TreeNode node = root.left;
        root.left=root.right;
        root.right=node;

        invertTree(root.left);
        invertTree(root.right);
    return root;
    }

}

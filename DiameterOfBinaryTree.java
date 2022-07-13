/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
    public static int height(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        else{
            return Math.max(height(root.left), height(root.right)) +1;
        }
    }
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		if(root == null){
            return 0;
        }
        int d1 = height(root.left) + height(root.right);
        int d2 = diameterOfBinaryTree(root.left);
        int d3 = diameterOfBinaryTree(root.right);
        
        return Math.max(d1, Math.max(d2, d3));
	}
}

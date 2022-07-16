 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class Solution {
 
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
 		return preorderTreeHelper(preOrder, Integer.MAX_VALUE, new int[]{0});
	}
    public static TreeNode<Integer> preorderTreeHelper(int[] preorder, int bound, int[] i){
        if(i[0] == preorder.length || preorder[i[0]] > bound){
            return null;
        }
        
        TreeNode<Integer> root = new TreeNode<Integer>(preorder[i[0]++]);
        
        root.left = preorderTreeHelper(preorder, root.data, i);
        root.right = preorderTreeHelper(preorder, bound, i);
        
        return root;
    }

}


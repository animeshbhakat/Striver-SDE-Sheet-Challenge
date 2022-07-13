/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {

    public static int isTrueBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int lh = isTrueBalanced(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = isTrueBalanced(root.right);
        if(rh == -1){
            return -1;
        }
        if(Math.abs(lh-rh) > 1){
            return -1;
        }
        else{
            return Math.max(lh, rh)+1;
        }
    }
	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		if(root == null){
            return true;
        }
        if(isTrueBalanced(root) > 0){
            return true;
        }
        return false;
	}
}


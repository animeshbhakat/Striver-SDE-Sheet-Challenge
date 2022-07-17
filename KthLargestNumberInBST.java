/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;

public class Solution {
    private static int count = 0;
    private static int answer = -1;    
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		count = k;
        answer = -1;
        helper(root);
        return answer;
	}
    public static void helper(TreeNode<Integer> root){
        if(root.right != null){
            helper(root.right);
        }
        count--;
        if(count == 0){
            answer = root.data;
            return;
        }
        if(root.left != null){
            helper(root.left);
        }
    }
}

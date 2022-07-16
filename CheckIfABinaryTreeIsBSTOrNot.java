Type – I (LeetCode)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValid(TreeNode root, long minValue, long maxValue){
        if(root == null){
            return true;
        }
        if(root.val <= minValue || root.val >= maxValue){
            return false;
        }
        return isValid(root.left, minValue, root.val) && isValid(root.right, root.val, maxValue);
    }
}

Type – II (CodeStudio)

/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/

public class Solution {
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean isValid(BinaryTreeNode<Integer> root, long minValue, long maxValue){
        if(root == null){
            return true;
        }
        if(root.data < minValue || root.data > maxValue){
            return false;
        }
        return isValid(root.left, minValue, root.data) && isValid(root.right, root.data, maxValue);
    }
}

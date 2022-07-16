Convert Sorted Array to BST

/****************************************************************

    Following is the class structure of the TreeNode class:

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


*****************************************************************/

import java.util.ArrayList;

public class Solution {
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
       if(n == 0){
           return null;
       }
        TreeNode<Integer> root = helper(arr, 0, n-1);
        
        return root;
    }
    public static TreeNode<Integer> helper(ArrayList<Integer> arr, int low, int high){
        if(low > high){
            return null;
        }
        int mid = (low + high)/2;
        TreeNode<Integer> node = new TreeNode(arr.get(mid));
        node.left = helper(arr, low, mid-1);
        node.right = helper(arr, mid+1, high);
        
        return node;
    }
}

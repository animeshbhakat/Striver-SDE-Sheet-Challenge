import java.util.*;
import java.lang.*;
import java.io.*;
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static void postOrderGenerate(List<Integer> answer, TreeNode root){
        if(root == null){
            return;
        }
        postOrderGenerate(answer, root.left);
        postOrderGenerate(answer, root.right);
        answer.add(root.data);
    }
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	List<Integer> answer = new ArrayList<>();
        postOrderGenerate(answer, root);
        return answer;
    }
}

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
    public static void inOrderGenerate(List<Integer> answer, TreeNode root){
        if(root == null){
            return;
        }
        inOrderGenerate(answer, root.left);
        answer.add(root.data);
        inOrderGenerate(answer, root.right);
    }
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	List<Integer> answer = new ArrayList<>();
        inOrderGenerate(answer, root);
        return answer;
    }
}

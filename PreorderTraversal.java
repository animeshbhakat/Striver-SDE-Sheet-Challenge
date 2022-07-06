import java.util.*;
import java.io.*;
import java.lang.*;
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
    public static void preOrderGenerate(List<Integer> answer, TreeNode root){
        if(root == null){
            return;
        }
        answer.add(root.data);
        preOrderGenerate(answer, root.left);
        preOrderGenerate(answer, root.right);
    }
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	List<Integer> answer = new ArrayList<>();
        preOrderGenerate(answer, root);
        return answer;
    }
}

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
public class BSTIterator{
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    boolean reverse = true;
    
    public BSTIterator(TreeNode root, boolean isReverse){
        reverse = isReverse;
        pushAll(root);
    }
    
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    
    public int next(){
        TreeNode tempNode = stack.pop();
        if(reverse == false){
            pushAll(tempNode.right);
        }
        else{
            pushAll(tempNode.left);
        }
        return tempNode.val;
    }
    
    public void pushAll(TreeNode root){
        while(root != null){
            stack.push(root);
            if(reverse == true){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        BSTIterator l = new BSTIterator(root, false);
        BSTIterator r = new BSTIterator(root, true);
        
        int i = l.next();
        int j = r.next();
        
        while(i < j){
            if(i+j == k){
                return true;
            }
            else if(i+j < k){
                i = l.next();
            }
            else{
                j = r.next();
            }
        }
        return false;
    }
}

Type – II (CodeStudio)

import java.io.*;
import java.lang.*;
import java.util.*;
/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/
public class Solution {
    public static void inorder(BinaryTreeNode root, ArrayList<Integer> answer){
        if(root == null){
            return;
        }
        inorder(root.left, answer);
        answer.add(root.data);
        inorder(root.right, answer);
    }
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		if(root == null){
            return false;
        }
        ArrayList<Integer> answer = new ArrayList<>();
        inorder(root, answer);
        int i = 0, j = answer.size() - 1;
        while(i < j){
            if(answer.get(i) + answer.get(j) == k){
                return true;
            }
            else if(answer.get(i) + answer.get(j) < k){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
	}
}

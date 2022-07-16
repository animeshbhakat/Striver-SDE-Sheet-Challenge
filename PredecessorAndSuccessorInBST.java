/*************************************************************
    Following is the Binary Tree node structure

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
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		BinaryTreeNode<Integer> successor = null;
        BinaryTreeNode<Integer> predecessor = null;
        ArrayList<Integer> answer = new ArrayList<>();
        BinaryTreeNode<Integer> curr = root;
        
        while(curr != null){
            if(curr.data <= key){
                curr = curr.right;
            }
            else{
                successor = curr;
                curr = curr.left;
            }
        }
        curr = root;

        while(curr != null){
            if(curr.data >= key){
                curr = curr.left;
            }
            else{
                predecessor = curr;
                curr = curr.right;
            }
        }
        
        if(predecessor == null){
            answer.add(-1);
        }
        else{
            answer.add(predecessor.data);
        }
        
        if(successor == null){
            answer.add(-1);
        }
        else{
            answer.add(successor.data);
        }

        return answer;
        
	}
}

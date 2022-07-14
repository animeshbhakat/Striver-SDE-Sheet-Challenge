/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
    public static boolean isLeaf(TreeNode root){
        return (root.left == null) && (root.right == null);
    }
    public static void addLeftBoundary(TreeNode root, ArrayList<Integer> answer){
        TreeNode curr = root.left;
        while(curr != null){
            if(isLeaf(curr) == false){
                answer.add(curr.data);
            }
            if(curr.left != null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }
    public static void addLeaves(TreeNode root, ArrayList<Integer> answer){
        if(isLeaf(root)){
            answer.add(root.data);
            return;
        }
        if(root.left != null){
            addLeaves(root.left, answer);
        }
        if(root.right != null){
            addLeaves(root.right, answer);
        }
    }
    public static void addRightBoundary(TreeNode root, ArrayList<Integer> answer){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        TreeNode curr = root.right;
        while(curr != null){
            if(isLeaf(curr) == false){
                temp.add(curr.data);
            }
            if(curr.right != null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        for(int i = temp.size()-1; i>=0; i--){
            answer.add(temp.get(i));
        }  
    }
    public static ArrayList<Integer> traverseBoundary(TreeNode root){
        ArrayList<Integer> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        if(isLeaf(root) == false){
            answer.add(root.data);
        }
        addLeftBoundary(root, answer);
        addLeaves(root, answer);
        addRightBoundary(root, answer);
        return answer;
    }
}

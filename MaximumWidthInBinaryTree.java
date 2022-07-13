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
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode _node, int _num){
        node = _node;
        num = _num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int answer = 0;
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            int mmin = q.peek().num;
            int first =0, last = 0;
            for(int i =0; i<size; i++){
                int currId = q.peek().num - mmin;
                TreeNode node = q.peek().node;
                q.poll();
                if(i == 0){
                    first = currId;
                }
                if(i == size -1){
                    last = currId;
                }
                if(node.left != null){
                    q.offer(new Pair(node.left, currId*2+1));
                }
                if(node.right != null){
                    q.offer(new Pair(node.right, currId*2+2));
                }
            }
            answer = Math.max(answer, last - first +1);
        }
        return answer;
    }
}


Type – II (CodeStudio)

import java.io.*;
import java.lang.*;
import java.util.*;
/************************************************************

    Following is the TreeNode class structure

    class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	   }
	}


************************************************************/

public class Solution {
	public static int getMaxWidth(TreeNode root) {
		if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int answer = 0;
        while(!q.isEmpty()){
            int size = q.size();
            answer = Math.max(answer, size);   
            for(int i =0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
        }
        return answer;
	}
}

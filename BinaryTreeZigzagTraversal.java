import java.io.*;
import java.util.*;
import java.lang.*;
/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/

public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		List<Integer> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;
        q.offer(root);
        while(!q.isEmpty()){
            int count  = q.size();
            for(int i =0; i< count; i++){
                BinaryTreeNode<Integer> curr = q.poll();
                if(reverse){
                    s.add(curr.data);
                }
                else{
                    answer.add(curr.data);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            if(reverse){
                while(!s.isEmpty()){
                    answer.add(s.pop());
                }
            }
            reverse = !reverse;
        }
        return answer;

	}
}


Type – I (LeetCode)

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node startLevel = root;
        while(startLevel != null){
            Node curr = startLevel;
            while(curr != null){
                if(curr.left != null){
                    curr.left.next = curr.right;
                }
                if(curr.right != null && curr.next != null){
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            startLevel = startLevel.left;
        }
        return root;
    }
}

Type – II (CodeStudio)

import java.io.*;
import java.util.*;
import java.lang.*;
/*
    ----------------- Binary Tree node class for reference -----------------

    class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;
	    public BinaryTreeNode<T> next;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	        next = null;
	    }
	};

*/

public class Solution {
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	if(root == null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.offer(root);
       while(!q.isEmpty()){
           int size = q.size();
           for(int i = 0; i<size; i++){
               BinaryTreeNode<Integer> curr = q.poll();
               if(i == size-1){
                   curr.next = null;
               }
               else{
                   curr.next = q.peek();
               }
               if(curr.left != null){
                   q.offer(curr.left);
               }
               if(curr.right != null){
                   q.offer(curr.right);
               }
           }
       }
	}
}

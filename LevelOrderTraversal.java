import java.util.*;
import java.lang.*;
import java.io.*;
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    ArrayList<Integer> al = new ArrayList<>();
      if(root == null){
          return al;
      }
      Queue<BinaryTreeNode> q = new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()){
          BinaryTreeNode curr = q.poll();
          if(curr.left != null){
              q.offer(curr.left);
          }
          if(curr.right != null){
              q.offer(curr.right);
          }
          al.add(curr.val);
      }
      return al;
  }

}

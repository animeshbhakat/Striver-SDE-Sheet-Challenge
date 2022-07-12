import java.io.*;
import java.lang.*;
import java.util.*;
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/
class Pair{
    BinaryTreeNode node;
    int hd;
    Pair(BinaryTreeNode n, int h){
        node = n;
        hd =h;
    }
}
public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
	
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        if(root == null){
            return al;
        }
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            BinaryTreeNode curr = p.node;
            int hd = p.hd;
            if(map.containsKey(hd) == false){
                map.put(hd, curr.val);
            }
            if(curr.left != null){
                q.add(new Pair(curr.left, hd-1));
            }
            if(curr.right != null){
                q.add(new Pair(curr.right, hd+1));
            }
        }
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            al.add(x.getValue());
        }
        return al;
	}
}

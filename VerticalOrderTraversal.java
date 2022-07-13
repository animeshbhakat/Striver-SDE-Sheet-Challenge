Type – 1 (LeetCode)

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
class Tuple{
    TreeNode node;
    int row;
    int column;
    Tuple(TreeNode _node, int _row, int _column){
        node = _node;
        row = _row;
        column = _column;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int row = tuple.row;
            int column = tuple.column;
            
            if(!map.containsKey(row)){
                map.put(row, new TreeMap<>());
            }
            if(!map.get(row).containsKey(column)){
                map.get(row).put(column, new PriorityQueue<>());
            }
            map.get(row).get(column).offer(node.val);
            
            if(node.left != null){
                q.offer(new Tuple(node.left, row-1, column+1));
            }
            if(node.right != null){
                q.offer(new Tuple(node.right, row+1, column+1));
            }
        }
        
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()){
            answer.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes : ys.values()){
                while(!nodes.isEmpty()){
                    answer.get(answer.size() -1).add(nodes.poll());
                }
            }
        }
        return answer;
    }
}

Type – 2 (CodeStudio)

/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.*;
class Pair{
    TreeNode<Integer> node;
    int hd;
    Pair(TreeNode<Integer> _node, int _hd){
        node = _node;
        hd = _hd;
    }
}
public class Solution 
{
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        ArrayList<Integer> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        Queue<Pair> q = new LinkedList<Pair>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair tuple = q.poll();
            TreeNode<Integer> curr = tuple.node;
            int hd = tuple.hd;
            if(map.containsKey(hd)){
                map.get(hd).add(curr.data);
            }
            else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(curr.data);
                map.put(hd,arr);
            }
            if(curr.left != null){
                q.offer(new Pair(curr.left, hd-1));
            }
            if(curr.right != null){
                q.offer(new Pair(curr.right, hd+1));
            }
        }
        for(Map.Entry<Integer, ArrayList<Integer>> p : map.entrySet()){
            ArrayList<Integer> al = p.getValue();
            for(int x : al){
                answer.add(x);
            }
        }
        return answer;
    }
}
